package Job;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a []= {7,2,8,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j])
				{
					 int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int a1:a)
		System.out.print(a1+" ");

	}

}
