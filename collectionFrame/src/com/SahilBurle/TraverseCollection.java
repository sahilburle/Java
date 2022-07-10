package com.SahilBurle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseCollection {
    public static void main(String args[]) {

        // Main nahi main aste
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abc");
        names.add("Def");
        names.add("Ghi");
        names.add("Jkl");
        names.add("Jkl");

        //for each loop

        for(String str: names) {
            System.out.print(str + "\t" + str.length() + "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("**********************************************************");

        //traversing using iterator
        //forward traversal
        Iterator<String> itr = names.iterator();

        while(itr.hasNext()) {

            String next = itr.next();
            System.out.println(next);
        }

        //backward traversal of collection
        System.out.println("***********************************************************");
        ListIterator<String> litr = names.listIterator(names.size());

        while(litr.hasPrevious()) {
            String previous = litr.previous();
            System.out.println(previous);
        }
        System.out.println("/*///////////////////*******/********");
        names.forEach(e-> {
            System.out.println(e);
        });
    }
}

