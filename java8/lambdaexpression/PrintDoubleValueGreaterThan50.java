package java8.lambdaexpression;

// Create a list of Double values and use a lambda to filter and collect only the values greater than 50.5 into a new list.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDoubleValueGreaterThan50 {

    public static void main(String[] args) {

        List<Double> numbers = Arrays.asList(12.0,34.0,56.0,78.0);
        System.out.println("Original List : "+numbers);

        List<Double> newList = numbers.stream().filter((e)->e>50.5).collect(Collectors.toList());
        System.out.println("NewList with number greater tham 50.5 : "+newList);
    }
}
