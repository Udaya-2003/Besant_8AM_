package Job;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,5};
		int n=5;
		int sum=n*(n+1)/2;
		int arrSum=0;
		for(int i:arr)
		arrSum+=i;
		System.out.println(sum-arrSum);

	}

}
