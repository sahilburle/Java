package src.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain1 {

    public static void main(String[] args) {

        // Q) create list and filter all even numbers from list

        List<Integer> list1 = List.of(2, 7, 58, 52, 63, 41, 65);

        List <Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(11);
        list2.add(78);
        list2.add(63);

        List<Integer> list3 = Arrays.asList(89,52,36,75,12,85,96);

        // list1
        /*
        without stream
        */
        List<Integer> listEven = new ArrayList<>();

        //for (type variableName : arrayName) {
        //      code block to be executed
        //      }

        for(Integer i:list1)
        {
            if(i % 2 == 0)
            {
                listEven.add(i);
            }
        }

        System.out.println(list1);

        System.out.println(listEven);

        /*
        using Stream API
         */

        Stream<Integer> stream = list1.stream();

        
    }
}
