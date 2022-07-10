package com.SahilBurle;

import java.util.*;

public class Main {
//Arraylist .....
    public static void main(String[] args) {

	     /*   creating collectiom

	        1) Type Safe - same type of elements are added to collecton.

	        2) Un Type Safe - different types of elements can be added.
	     */
        //Type Safe Collection
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abc");
        names.add("Def");
        names.add("Ghi");
        names.add("Jkl");
        names.add("Jkl");

        System.out.println(names);
        //System.out.println(names.get(2));
        //System.out.println(names.remove(4));
        System.out.println(names);
        System.out.println(names.isEmpty());

        names.add(3, "Lkj");

        System.out.println(names);

        Vector<String> vec = new Vector<>();

        vec.addAll(names);

        System.out.println(vec);

        HashSet<Double> xxx = new HashSet<Double>();

        xxx.add(12.21);
        xxx.add(30.03);
        xxx.add(56.56);
        xxx.add(98.89);
        xxx.add(89.89);

        System.out.println(xxx);

        TreeSet<Double> test = new TreeSet<>();
        test.addAll(xxx);

        System.out.println(test);


        //untype safe
        LinkedList list = new LinkedList();
    }
}
