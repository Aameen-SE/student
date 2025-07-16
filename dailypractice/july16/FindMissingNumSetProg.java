package dailypractice.july16;

import java.util.HashSet;
import java.util.Set;

public class FindMissingNumSetProg {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6};

        int n= arr.length+1; // as we know 1 is missing so the array of length is 5 : 5+1=6;

        Set<Integer> set = new HashSet<>();

        for(int i: arr){
            set.add(i);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
