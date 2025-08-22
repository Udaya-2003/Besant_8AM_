package opps_concept;

public class Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,1,4,3,2,1,2,4,5};
		int b=-1;
		for(int i=0;i<a.length;i++) {
			if(a [i]==b)
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					a[j]=b;
				}
			}
			if(count>1) {
				System.out.println(a[i]+"->"+count+"times");
			}
			
		}
		

	}

}
