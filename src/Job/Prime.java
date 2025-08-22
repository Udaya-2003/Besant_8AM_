package Job;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isprime=true;
		int n=15;
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				 isprime=false ;
				 break;
			}
			
		}
		if(isprime)
		System.out.println(n+"prime");
		else
			System.out.println(n+"not prime");
	}
}


