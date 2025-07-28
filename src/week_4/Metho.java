package week_4;
import java.util.*;
public class Metho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="hello java";
		System.out.println(s.charAt(3));
		System.out.println(Arrays.toString(s.split("a")));
		System.out.println(Arrays.toString(s.split(" ")));
		System.out.println(Arrays.toString(s.split("")));
		String a2 ="a";
		System.out.println(s.compareTo("d"));
		System.out.println(a2.equals(s));
		char [] c1 = {'a','p','p'};
		System.out.println(String.copyValueOf(c1));
		String [] c2= {"a","p","p"};
		System.out.println(String.join("%", c2));
		String s5 ="java";
		System.out.println(s5.indexOf("a",2));
		//lastindex
		System.out.println(s5.lastIndexOf("a"));
		System.out.println(s5.contains("ja"));
		System.out.println(s5.startsWith("j"));
		System.out.println(s5.endsWith("f"));
		System.out.println(s5.substring(0, 2));






		
	}

}
