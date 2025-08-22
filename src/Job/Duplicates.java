package Job;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4,4,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];// sort the array
					arr[j]=temp;
				}
				
			}
			
		}

	}

}
