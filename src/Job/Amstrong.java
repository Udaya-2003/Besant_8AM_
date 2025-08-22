package Job;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		}
		System.out.println(temp==sum);
		

	}

}
