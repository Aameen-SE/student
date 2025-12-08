package dailypractice.dec08;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberFromArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        evenNum(arr);
    }

    public static void evenNum(int[] arr){

        List<Integer> evenNum = new ArrayList<Integer>();
        for(int a:arr){
            if((a&1)!=1)
                evenNum.add(a);
        }

        System.out.println(evenNum);
    }
}
