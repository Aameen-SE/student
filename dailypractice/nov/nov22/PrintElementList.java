package dailypractice.nov.nov22;

import java.util.Arrays;
import java.util.List;

public class PrintElementList {
    public static void main(String[] args) {
        //Write a lambda expression to print all elements of a list

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.forEach(System.out::println);

    }
}
