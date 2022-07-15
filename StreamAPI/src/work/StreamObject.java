package src.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //1- blank stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });

        //2- array, object, collection
        String names[] = {"Durgesh", "Uttam", "Ankit", "Divya"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        //3
        Stream<Object> streamBuilder = Stream.builder().build();

        //4
        IntStream stream = Arrays.stream(new int[]{2,4,8,6,78,95,12});

        stream.forEach(e -> {
            System.out.print(" " + e);
        });

        //5. List, Set
        List <Integer> list2 = new ArrayList<>();

        list2.add(10);
        list2.add(11);
        list2.add(78);
        list2.add(63);

        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(e-> {
            System.out.println(e);
            
        });

    }
}
