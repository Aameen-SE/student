package july2026;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {

    public static void main(String[] args) {

        int arr[] = {1,2,3,2,4,5,1};

        Set<Integer> set = new HashSet<>();

        for (int a:arr){
            if (!set.add(a)){
                System.out.println(a);
            }
        }
    }
}
