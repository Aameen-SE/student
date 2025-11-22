package dailypractice.nov.nov22;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.stream().filter(e->e%2==0).forEach(System.out::println);
    }
}
