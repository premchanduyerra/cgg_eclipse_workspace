package collections;

import java.util.List;

import java.util.*;

import loops.a;

public class Lists {

    public static void main(String[] args) {

        List<String> a1 = new ArrayList<String>();
        a1.add("dd");
        a1.add("d2");
        a1.add("d3");
        a1.add("d4");
        a1.add("d5");
        System.out.println("Elements are:" + a1);

        List<String> a2 = new ArrayList<String>();
        a2.add("cc");
        a2.add("c1");
        a2.add("c2");
        a2.add("c3");
        a2.add("c4");
        a1.addAll(2, a2);
        System.out.println("Elements are:" + a1);

        System.out.println(a1.indexOf("c2"));

        int a[] = { 1, 32, 11 };
        String s[] = { "ss", "hh" };
        List al = Arrays.asList(a);

        List<int[]> list = Arrays.asList(a);
        System.out.println(list.getClass().getName());

        System.out.println(Arrays.toString(list.get(0)));

    }

}
