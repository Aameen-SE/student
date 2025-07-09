package collectin.set;

import java.util.*;

public class SumOfUniqueNum {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(Arrays.asList(5, 3, 8, 3, 1, 5));
        // adding th elist to set so to remove duplicate
        Set<Integer> number= new HashSet<>(numberList);
        System.out.println("After removing duplicate list :"+number);
        int sum =0;
        for(int n : number){
            sum=sum+n;
        }
        System.out.println("Sum of all the number in set : "+sum);
    }
}
