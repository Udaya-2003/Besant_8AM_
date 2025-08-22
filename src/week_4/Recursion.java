package week_4;

public class Recursion {
	public static void printNum(int n) {
		if(n==0) {
			return;
		}
		printNum(n-1);
		System.out.println(n+" ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int limit=100;
      printNum(limit);
	}

}
