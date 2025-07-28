package opps_concept;
import java.util.Scanner;

public class Array {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = s.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter " + size + " elements:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = s.nextInt();
	        }

	        int index = 0;
	        while (index < arr.length) {
	            int move = arr[index];
	            index = index + move;
	        }

	        if (index == arr.length) {
	            System.out.println("Proper array");
	        } else {
	            System.out.println("Improper array");
	        }
	        s.close();
	    }
	}

	
	
	
	
	
	

