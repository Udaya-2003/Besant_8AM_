package L3_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MainBooking {

    static int totalSeats=3,upper=1,lower=1,middle=1,
    wlLimit=3,pid=1;

    static List<Passenger> bkdPassengers = new ArrayList<>();
    static List<Passenger> wlPassengers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Train Booking\n1.Book ticket\n2.Cancel Ticket" +
                "\n3.View ticket");
        Scanner sc = new Scanner(System.in);

        String choiceString ="Y";
        while(choiceString.equalsIgnoreCase("Y")) {
            System.out.println("Enter the options from above");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    String name=sc.next();
                    System.out.println("Enter your prefBerth\t UPPER,MIDDLE,LOWER");
                    String prefBerth = sc.next();
                    Passenger p = new Passenger(pid,name,Berth.valueOf(prefBerth));
                    bookTicket(p);
                    pid++;
                    break;
                case 2:
                    System.out.println("Please enter id to cancel");
                    int pid = sc.nextInt();
                    cancelTicket(pid);
                    break;
                case 3:
                    System.out.println("Booked passengers"+bkdPassengers);
                    System.out.println("WL passengers"+wlPassengers);
                    break;
                default:
                    choiceString = "N";
                    break;
            }
        }
    }

    static void increaseSeatsBaseBerth(Passenger p){
        switch (p.getAllocatedBerth()){
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
        Optional<Passenger> bkdPassenger = bkdPassengers.stream().filter(e->e.getId()==pid)
                .findFirst();
        if(bkdPassenger.isEmpty()){
            System.out.println("Invalid passenger id");
        }else{
            if(wlPassengers.isEmpty()){
                totalSeats++;
                increaseSeatsBaseBerth(bkdPassenger.get());
            }else{
                wlPassengers.get(0).setAllocatedBerth(bkdPassenger.get().getAllocatedBerth());
                bkdPassengers.add(wlPassengers.get(0));
                wlPassengers.remove(0);
                wlLimit++;
            }
            bkdPassengers.removeIf(e->e.getId()==pid);
        }
    }

    private static void bookTicket(Passenger p) {
        if(totalSeats>0){
            allocateBerth(p);
            bkdPassengers.add(p);
            totalSeats--;
            System.out.println("your seat has been booked for berth"+p.getAllocatedBerth());
        }else if(wlLimit>0){
            wlPassengers.add(p);
            wlLimit--;
            System.out.println("Ticket is in WL queue");
        }else{
            System.out.println("Regret to book");
        }
    }
    private static void allocateBerth(Passenger p) {
        switch(p.getPrefBerth()){
            case UPPER:
                if(upper>0) {
                    p.setAllocatedBerth(Berth.UPPER);
                    upper--;
                }
            case LOWER:
                if(p.getAllocatedBerth()==null && lower>0){
                    p.setAllocatedBerth(Berth.LOWER);
                    lower--;
                }
            case MIDDLE:
                if(p.getAllocatedBerth()==null && middle>0){
                    p.setAllocatedBerth(Berth.MIDDLE);
                    middle--;
                }else if(p.getAllocatedBerth()==null && upper>0){
                    p.setAllocatedBerth(Berth.UPPER);
                    upper--;
                }else if(p.getAllocatedBerth()==null && lower>0){
                    p.setAllocatedBerth(Berth.LOWER);
                    lower--;
                }
        }
    }
}


