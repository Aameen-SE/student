package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEven {
    public static void main(String[] args) {
        //Filter out even numbers from a list using a lambda
        List<Integer> number = Arrays.asList(12,34,54,56,78,867,90);
        System.out.println("Original List : "+number);
      List<Integer> evenList =  number.stream().
                filter(e->e%2==0).
                collect(Collectors.toList());
        System.out.println("EvenList from original"+evenList);
    }
}
