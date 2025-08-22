package L4_project;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Passenger ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Preferred Berth (UPPER/MIDDLE/LOWER): ");
        Berth pref = Berth.valueOf(sc.nextLine().toUpperCase());

        System.out.print("Enter Allocated Berth (UPPER/MIDDLE/LOWER): ");
        Berth alloc = Berth.valueOf(sc.nextLine().toUpperCase());

        LocalDate date = LocalDate.now();

        Passenger passenger = new Passenger(id, name, pref, alloc, date);

        Booking booking = new Booking();
        booking.savePassenger(passenger);

        sc.close();
    }
}
