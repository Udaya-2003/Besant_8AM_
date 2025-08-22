package week_4;

public class Rp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Udaya geetha ";
	       String [] words = input.split(" ");
	       StringBuilder result = new StringBuilder();
	       for (int i=0;i<words.length;i++)
	       {
	    	   
	    	  result.append(new StringBuilder(words[i]).reverse()) ;
	    	  
	    	   result.append(" ");
	    	      
	    	  }
	    	  
	      
	       System.out.println(result.toString().trim());

	}

}
