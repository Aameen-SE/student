package practice2026.array;

import java.util.ArrayList;
import java.util.List;

public class FindArmstrongNumInArr {
    public static void main(String[] args) {
        int [] arr = {123,153,143,189,198};
        List<Integer> isArmstrong = new ArrayList<>();

        for(int a:arr){
        if(isArmstrongOrNot(a)){
            isArmstrong.add(a);
        }
        }

        System.out.println(isArmstrong);
    }

    public static boolean isArmstrongOrNot(int n){
        int original =n;
        int sum=0;
        for(;n>0;){
            int digit = n%10;
             sum=sum+digit*digit*digit;
            n=n/10;
        }
        return sum == original;
    }
}
