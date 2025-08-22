package Job;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		int [] arr2 = {4,5,6};
		int n = arr.length+arr2.length;
		int [] full = new int [n];
		int k=0;
		for(int a: arr) {
			full[k++] = a;
		}
		
		for(int a:arr2) {
			full[k++]=a;
		}
		
		for(int i=0;i<full.length-1;i++) {
			if(full[i]>full[i+1]) {
				int temp = full[i];
				full[i] = full[i+1];
				full[i+1] = temp;
			}
		}
		System.out.println(Arrays.toString(full));

	}

}
