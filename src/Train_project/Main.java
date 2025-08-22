package Train_project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	    static int totalSeats = 3, upper = 1, middle = 1, lower = 1, wlLimit = 3, pid = 0;
	    static List<Passengers> bkdPassengers = new ArrayList<>();
	    static List<Passengers> wlPassengers = new ArrayList<>();

	    public static void main(String[] args) {
	        System.out.println("Welcome To Train Booking\n1.Book Ticket\n2.Cancel Ticket\n3.ViewTicket");
	        Scanner sc = new Scanner(System.in);
	        String choiceString = "Y";
	        while (choiceString.equalsIgnoreCase("Y")) {
	            System.out.println("Enter the options from above: ");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            switch (choice) {
	                case 1:
	                    System.out.println("Enter Your Name: ");
	                    String name = sc.nextLine();

	                    System.out.println("Enter the PrefBerth: UPPER,MIDDLE,LOWER");
	                    String prefBerth = sc.nextLine();
	                    Passengers p = new Passengers(pid, name, Berth.valueOf(prefBerth));
	                    bookTicket(p);
	                    pid++;
	                    break;

	                case 2:
	                    System.out.println("Please Enter the ID to Cancel");
	                    int pid = sc.nextInt();
	                    cancelTicket(pid);
	                    break;

	                case 3:
	                    viewTickets();
	                    break;

	                default:
	                    choiceString = "N";
	            }
	        }
	    }

	    static void increaseSeatsBaseBerth(Passengers p) {
	        switch (p.getAllocatedBerth()) {
	            case UPPER:
	                upper++;
	                break;
	            case LOWER:
	                lower++;
	                break;
	            case MIDDLE:
	                middle++;
	                break;
	        }
	    }

	    private static void cancelTicket(int pid) {
	        Optional<Passengers> bkdPassenger = bkdPassengers.stream().filter(e -> e.getpId() == pid).findFirst();
	        if (bkdPassengers.isEmpty()) {
	            System.out.println("Invalid Passenger ID");
	        } else {
	            if (wlPassengers.isEmpty()) {
	                totalSeats++;
	                increaseSeatsBaseBerth(bkdPassenger.get());
	            } else {
	                wlPassengers.get(0).setAllocatedBerth(bkdPassenger.get().getAllocatedBerth());
	                bkdPassengers.add(wlPassengers.get(0));
	                insertPassenger(wlPassengers.get(0));
	                wlPassengers.remove(0);
	                wlLimit++;
	            }
	            bkdPassengers.removeIf(e -> e.getpId() == pid);
	            deletePassenger(pid);
	            System.out.println("Ticket cancelled successfully");
	        }
	    }

	    private static void bookTicket(Passengers p) {
	        if (totalSeats > 0) {
	            allocateBerth(p);
	            bkdPassengers.add(p);
	            totalSeats--;
	            insertPassenger(p);
	            System.out.println("Your seat has been booked for Berth " + p.getAllocatedBerth());
	        } else if (wlLimit > 0) {
	            wlPassengers.add(p);
	            wlLimit--;
	            System.out.println("Added to Waiting List");
	        } else {
	            System.out.println("Regret To Book");
	        }
	    }

	    private static void allocateBerth(Passengers p) {
	        switch (p.getPrefBerth()) {
	            case UPPER:
	                if (upper > 0) {
	                    p.setAllocatedBerth(Berth.UPPER);
	                    upper--;
	                }
	            case LOWER:
	                if (p.getAllocatedBerth() == null && lower > 0) {
	                    p.setAllocatedBerth(Berth.LOWER);
	                    lower--;
	                }
	            case MIDDLE:
	                if (p.getAllocatedBerth() == null && middle > 0) {
	                    p.setAllocatedBerth(Berth.MIDDLE);
	                    middle--;
	                } else if (p.getAllocatedBerth() == null && upper > 0) {
	                    p.setAllocatedBerth(Berth.UPPER);
	                    upper--;
	                } else if (p.getAllocatedBerth() == null && lower > 0) {
	                    p.setAllocatedBerth(Berth.LOWER);
	                    lower--;
	                }
	        }
	    }

	    private static void insertPassenger(Passengers p) {
	        try (Connection conn = DBConnection.getConnection()) {
	            String sql = "INSERT INTO passengers (pId, name, prefBerth, allocatedBerth, bkdDate) VALUES (?, ?, ?, ?, ?)";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, p.getpId());
	            ps.setString(2, p.getName());
	            ps.setString(3, p.getPrefBerth().name());
	            ps.setString(4, p.getAllocatedBerth().name());
	            ps.setDate(5, java.sql.Date.valueOf(p.getBkdDate()));
	            ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static void deletePassenger(int pid) {
	        try (Connection conn = DBConnection.getConnection()) {
	            String sql = "DELETE FROM passengers WHERE pId = ?";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pid);
	            ps.executeUpdate();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    private static void viewTickets() {
	        try (Connection conn = DBConnection.getConnection()) {
	            String sql = "SELECT * FROM passengers";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) {
	                System.out.println(
	                        "Passenger [pId=" + rs.getInt("pId") +
	                                ", name=" + rs.getString("name") +
	                                ", prefBerth=" + rs.getString("prefBerth") +
	                                ", allocatedBerth=" + rs.getString("allocatedBerth") +
	                                ", bkdDate=" + rs.getDate("bkdDate") + "]"
	                );
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


