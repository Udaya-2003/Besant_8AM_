package week_4;

import java.util.ArrayList;
import java.util.List;

public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> a = new ArrayList<>();
		List<Integer> innerList = new ArrayList<>();
		innerList.add(1);
		innerList.add(2);
		innerList.add(3);
		innerList.add(8);
		a.add(innerList);
		innerList.add(3,4);
		List<Integer> innerList1 = new ArrayList<>();
		innerList1.add(4);
		innerList1.add(5);
		innerList1.add(6);
		a.add(innerList1);
		innerList1.remove(1);
		System.out.println(a);
		//String
		List<List<String>> a1 = new ArrayList<>();
		List<String> innerList3 = new ArrayList<>();
		innerList3.add("a");
		innerList3.add("b");
		innerList3.add("i");
		innerList3.add("t");
		a1.add(innerList3);
		System.out.println(a1);
		innerList3.remove("t");
		System.out.println(a1);

	}

}
