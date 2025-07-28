package opps_concept;

public class Arra {

	public static void main(String[] args) {
	        int[] arr = {2, 4, 7, 2, 5, 7, 9};

	        boolean foundDuplicate = false;
	        System.out.println("Duplicate elements are:");

	        for(int i = 0; i < arr.length; i++) {
	            for(int j = i + 1; j < arr.length; j++) {
	                if(arr[i] == arr[j]) {
	                    System.out.println(arr[i]);
	                    foundDuplicate = true;
	                    break;
	                }
	            }
	        }

	        if (!foundDuplicate) {
	            System.out.println("No duplicates found.");
	        }
	    }

		
		

	}


