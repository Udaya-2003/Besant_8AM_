package Job;

public class Secwith_1for {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {4,7,2,1};
		int largest=a[0];
		int SecondLar=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>largest) {
			SecondLar=largest;
			largest=a[i];
			}
			else if(a[i]<largest && a[i]>SecondLar) {
				SecondLar=a[i];
			}
		}
		System.out.println(SecondLar);
	}


}
