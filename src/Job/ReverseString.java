package Job;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geetha";
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		//this is used for mutable
		String str2="hello";
		StringBuilder result=new StringBuilder();
		for(int i=str2.length()-1;i>=0;i--) {
			result=result.append(str2.charAt(i));
			
		}
		System.out.println(result.toString());
		
		

	}

}
