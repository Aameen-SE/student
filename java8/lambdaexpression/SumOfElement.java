package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class SumOfElement {
    public static void main(String[] args) {
        //Find the sum of all elements in a list using a lambda
        List<Integer> number = Arrays.asList(12,23,45,65,78);

       int sum = number.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum of the element : "+sum);
    }
}
