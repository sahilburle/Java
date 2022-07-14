package src.work;

import java.util.Arrays;
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
    }
}
