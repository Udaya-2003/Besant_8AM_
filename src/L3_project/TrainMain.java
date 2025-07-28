package L3_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainMain {
	static int total = 3,upper=1,lower =1,middle =1,wlLimit=3;
	static List<Passenger> bkdPassenger = new ArrayList<Passenger>();
	static List<Passenger> wlPassenger = new ArrayList<Passenger>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        while(true) {
        	Scanner sc = new Scanner(System.in);
        	int choice = sc.nextInt();
        	switch(choice) {
        	case 1:
        		String name =sc.nextLine();
        		String prefberth=sc.nextLine();
        		Passenger p = new Passenger();
        		p.setpId(++pid);
        		p.setPrefBerth(Berth.valueOf(prefberth));
        		p.setName(name);
        		bookTicket(p);
        	case 2:
        	}
        	
        	
        }
	}

}
