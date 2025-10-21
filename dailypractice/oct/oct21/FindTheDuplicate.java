package dailypractice.oct.oct21;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,34,5,2,3,1};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int i:arr){

            if(!seen.add(i)){
                duplicates.add(i);
            }
        }

        System.out.println("Duplicates Element in Array is :"+duplicates);
    }
}
