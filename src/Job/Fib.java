package Job;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,a=0,b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
