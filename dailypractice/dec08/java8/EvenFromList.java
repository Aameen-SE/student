package dailypractice.dec08.java8;

import java.util.Arrays;
import java.util.List;

public class EvenFromList {
    public static void main(String[] args) {
        //Get all even numbers from a list

        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> evenList =number.stream().filter(num-> num%2==0).toList();
        System.out.println(evenList);
    }
}
