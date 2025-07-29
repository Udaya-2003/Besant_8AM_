package week_4;
import java.util.HashMap;
import java.util.Map;

public class Hash {

  public static void main(String[] args) {
    
    String s="Hello";
    Map<String, Integer> hmap = new HashMap<>();
    
    for (int i = 0; i < s.length(); i++) {
      hmap.put(s.charAt(i)+"", hmap.getOrDefault(s.charAt(i)+"",0)+1);
    }
    for (int i = 0; i < s.length(); i++) {
      if(hmap.get(s.charAt(i)+"")>1) {
        System.out.println(s.charAt(i));
        break;
      }
    }   
    System.out.println(hmap);
  }

}
