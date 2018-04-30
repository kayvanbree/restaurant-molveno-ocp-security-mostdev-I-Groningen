package it.molveno.restaurant.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(0, 1, 1, 1, 2, 3, 3, 3, 3, 4, 4, 4, 5, 6, 7, 7, 7, 8);

        numberList.stream().filter(element -> element % 2 == 0).forEach(element -> {
            System.out.println(element);
        });

        numberList.stream().filter(n -> n %2 == 0).map(n -> n*n).forEach(element -> {
            System.out.println(element);
        });

        List<Integer> evenNumbers = numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        evenNumbers.stream().map(n -> n*n).forEach(System.out::println);
    }
}
