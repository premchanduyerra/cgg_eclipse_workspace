package Collectionsss;

import java.util.*;
import java.util.Iterator;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(12);

		list1.add(13);
		list1.add(14);
		list1.add(15);

		Iterator<Integer> itr = list1.iterator();

		System.out.println("array list" + list1);

		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(11);
		list2.add(12);

		list2.add(13);
		list2.add(14);
		list2.add(15);

		Iterator<Integer> itr2 = list2.iterator();

		System.out.println("LinkedList list" + list2);

		Vector<Integer> list3 = new Vector<Integer>();
		list3.add(11);
		list3.add(12);

		list3.add(13);
		list3.add(14);
		list3.add(15);

		Iterator<Integer> itr3 = list3.iterator();

		System.out.println("Vector list" + list3);

	}

}
