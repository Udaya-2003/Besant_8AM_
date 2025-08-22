package Job;

public class LarOrSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {3,7,1,9,4};
		int lar = a[0];
		int small = a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>lar)
			{
				lar=a[i];
			}
			if(a[i]<small)
			{
				small=a[i];
			}
		}
		System.out.println(lar);
		System.out.println(small);

	}

}
