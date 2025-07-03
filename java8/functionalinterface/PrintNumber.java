package java8.functionalinterface;
//Create a list of integers.
// Use Predicate<Integer> functional interface with a lambda to filter
// and print only numbers greater than 50.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrintNumber {
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>(Arrays.asList(12,23,45,67,89,90,98,78));
        Predicate<Integer> greaterThan50 = n -> n>50;

        number.stream()
                .filter(greaterThan50)
                .forEach(System.out::println);
    }
}
