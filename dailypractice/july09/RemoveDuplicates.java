package dailypractice.july09;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 3, 9, 1, 5, 3, 7, 9, 1, 2));
        System.out.println("Original List : "+numbers);
        Set<Integer> uniqueNumber = new HashSet<>(numbers);

        List<Integer> descendNumOrder = new ArrayList<>(uniqueNumber);
        descendNumOrder.sort((e1,e2)->e2-e1);
        System.out.print("After removing duplicates and in descending order List : ");
        System.out.println(descendNumOrder);

    }
}
