package src.work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args) {

        //filter(Predicate)
            //boolean value function
            //e->{ return }
            //e->e>10




        //map(Function)     -   returns value, element pe kaam hoga
        /*
            each element operation


        */

        List<String> names = List.of("Aman", "ANkit", "Abhinav", "DUrgesh");

        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());

        System.out.println(newNames);

        List<Integer> numbers = List.of(23,45,1,8,4,75);
        List<Integer> newNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(newNumbers);

        names.stream().forEach(
                e->{
                    System.out.println(e);
                }
        );

        newNames.stream().forEach(System.out::println);

        //sorted

        numbers.stream().sorted().forEach(System.out::println);

        Integer integer = numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println(integer);

        Integer integer1 = numbers.stream().max((x,y) -> x.compareTo(y)).get();
        System.out.println(integer1);
    }
}
