package Job;

public class Second_lar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {4,2,5,6};
		int max1 = 0;
		int max2 = 0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max1)
			{
				max1=a[i];
			}
		}
		//System.out.println(max1);  -> 1st lar
		for(int j=0;j<a.length;j++)
		{
			if(a[j]!=max1)
			{
				if(a[j]>max2)
				{
					max2=a[j];
				}
			}
		}
		System.out.println(max2);
		

	}

}
