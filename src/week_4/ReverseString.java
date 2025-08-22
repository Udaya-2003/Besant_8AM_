package week_4;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String input = "Udaya geetha girl";
       String [] words = input.split(" ");
       StringBuilder result = new StringBuilder();
       for (int i=0;i<words.length;i++)
       {
    	   if(i%2==0) {
    	  result.append(new StringBuilder(words[i]).reverse()) ;
    	  }else {
    		  result.append(words[i]);
    	  }
    	   result.append(" ");
    	      
    	  }
    	  
      
       System.out.println(result.toString().trim());
	}

}
