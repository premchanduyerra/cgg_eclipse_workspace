package collections;

import java.util.*;

public class array_list2 {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		ArrayList<String> list1 = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Printing the arraylist object
		System.out.println(list);
		list1.addAll(list);
		// Collections.addAll(list1, list);
		System.out.println(list1);
		list1.clear();
		System.out.println(list1);
		list1.add(0, "Mango");
		System.out.println(list1);

		System.out.println(list1.equals(list1));
		System.out.println(list1.isEmpty());

		// System.out.println(list1.remove("prem"));
		System.out.println(list1);
		System.out.println(list.removeAll(list1));
		System.out.println(list);
		Object[] a = list.toArray();
		System.out.println(a.getClass().getName());

	}
}
