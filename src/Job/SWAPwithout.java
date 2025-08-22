package Job;

public class SWAPwithout {
	public static void main(String [] args) {
		int a=10;
		int b=5;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);//using operators 
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a="+a);
		System.out.println("b="+b);//using temp
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a="+a);
		System.out.println("b="+b);//using xor
		
	}

}
