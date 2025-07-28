package opps_concept;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		try {
	
       	int b =s.nextInt();
		System.out.println("Valid");
		}
		catch(Exception e) {
			System.out.println("not valid");
		}
		s.close();
		
		}
	}


