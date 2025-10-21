package dailypractice.oct.oct21;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 3, 7, 5, 2, 9};

        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        System.out.println("After removing duplicates : "+set);
    }
}
