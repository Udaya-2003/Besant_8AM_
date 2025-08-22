package opps_concept;

public class Repeated_ {
	public static void main(String args[]) {
		int [] a= {2,1,4,3,2,1,2,4,5};
		int k=2;
		boolean [] visited=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(visited [i])
				continue;
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count>=k) {
				System.out.println(a[i]+"->"+count+"times");
			}
			
		}
		
	}

}
