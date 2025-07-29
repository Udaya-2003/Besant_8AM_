package opps_concept;

import java.util.Scanner;

public class swi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your choice");
		Scanner s = new Scanner(System.in);
		int choice=s.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Monday");
		case 2:
			System.out.println("tueday");
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("tuesday");
			break;
		case 5:
			System.out.println("friday");
			break;
		default:
			System.out.println("Not valid choice");
			break;
		}
		

	}

}
