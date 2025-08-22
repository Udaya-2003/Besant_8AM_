package Job;

import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";

		HashMap<Character, Integer> h1 = new HashMap<>();
		HashMap<Character, Integer> h2 = new HashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			h1.put(s1.charAt(i), h1.containsKey(s1.charAt(i)) ? h1.getOrDefault(s1.charAt(i), 0) + 1 : 0);
			h2.put(s2.charAt(i), h2.containsKey(s2.charAt(i)) ? h2.getOrDefault(s2.charAt(i), 0) + 1 : 0);

		}
		System.out.println(h1);
		System.out.println(h2);
		if (h1.equals(h2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
