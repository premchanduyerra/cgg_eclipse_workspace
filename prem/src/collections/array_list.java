package collections;

import java.util.*;

public class array_list {

	public static void main(String[] args) {

		ArrayList<Integer> obj = new ArrayList<Integer>();

		// rays.asList(1,2,3,4));
		Iterator<Integer> it = Collections.nCopies(10, 5).iterator();
		obj.add(9);

		obj.addAll(Collections.nCopies(10, 5));

		/*
		 * while(it.hasNext()) { obj.add(it.next()); }
		 */

		// obj.remove(2);
		// obj.set(2,10);
		System.out.println("Elements are:" + obj);
	}

}
