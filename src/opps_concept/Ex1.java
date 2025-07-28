package opps_concept;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        int a;

		        while (true) {
		            System.out.print("Enter a number: ");
		            try {
		                a = Integer.parseInt(s.nextLine());  
		                System.out.println("Valid");
		                break;  
		            } catch (Exception e) {
		                System.out.println("Input is invalid re enter again");
		            }
		        }

		        s.close();
		    }



	}

