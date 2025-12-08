package dailypractice.dec08.java8;

import java.util.Arrays;
import java.util.List;

public class SortInDescendingOrder {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.sort((a,b)->b-a);
        System.out.println(numbers);
    }
}
