package java8.methodreference;
//Create a list of integers and use a method reference to Integer::sum with reduce() to find the sum of all numbers.


import java.util.Arrays;
import java.util.List;

public class SumOfTheElement {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(12,23,34,54);
        System.out.println("Original List : "+number);

       int sum = number.stream().reduce(0,Integer::sum);
        System.out.println("Sum of the element in list : "+sum);
    }
}
