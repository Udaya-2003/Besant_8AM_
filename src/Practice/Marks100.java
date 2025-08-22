package Practice;

public class Marks100 {
	public static void print(Object o) {
		System.out.println("Object");
		
	}
	public static void print(String s) {
		System.out.println("String");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		String a ="hello";
		String b ="hel"+"lo";
		String c ="hel";
		String d =c+"lo";
		System.out.println(a==b);
		System.out.println(a==d);
		
		//2.
		int i=0;
		while(i<5) {
			if(i++%2==0)
				continue;
			System.out.print(i);
			
		}
		
		//
		System.out.println(" ");
		
		//3.
		int x=2;
		switch(x) {
		case 1:
			System.out.print("A");
		case 2:
			System.out.print("B");
		case 3:
			System.out.print("C");
		default:
			System.out.print("D");
		}
		
		//
		System.out.println(" ");
		
		
		
		//4.
		int sum=0;
		for(int k=0;k<3;k++) {
			for(int j=k;j<3;j++){
				sum+=j;
				
			}
		}
		System.out.println(sum);
		
		
		//
		System.out.println(" ");
		
		
		//5.
		print(null);

	}

}
