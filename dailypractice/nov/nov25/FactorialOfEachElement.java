package dailypractice.nov.nov25;

import java.util.ArrayList;
import java.util.List;

public class FactorialOfEachElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};

        fact(arr);
    }

    public static void fact(int[] arr){
        List<Integer> factList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            factList.add(factOfNum(arr[i]));
        }
        System.out.println(factList);
    }

    public static int factOfNum(int num){
        int fact=1;
        for(int i=num;i>1;i--){
            fact=fact*i;
        }
        return fact;
    }
}
