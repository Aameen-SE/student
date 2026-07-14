package july2026.jul14;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,1,2,3,4,5};

        Set<Integer> set = new HashSet<>();
        for (int a:arr){
            if(!set.add(a))
                System.out.print(a+" , ");
        }
    }
}
