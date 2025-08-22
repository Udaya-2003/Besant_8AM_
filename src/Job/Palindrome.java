package Job;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=121;
      int temp=num;
      int res=0;
      while(num>0)
      {
    	  res=res*10+num%10;//for int
    	  num=num/10;
    	  
      }
      System.out.println(res==temp);
      
      String str="Madam";
		StringBuilder result=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			result=result.append(str.charAt(i));//for string
		}
		 String str2=result.toString();
		System.out.println(str.equalsIgnoreCase(str2)); 
	}

}
