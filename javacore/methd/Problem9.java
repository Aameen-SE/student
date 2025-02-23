package javacore.methd;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        //int sum(int[]), find sum of all elements of an array and return sum

        int[] arr={12,23,45,65,78,98,100};
        System.out.println(Arrays.toString(arr));
        int result=sum(arr);
        System.out.println("Sum of the given array is :"+result);

    }
    public static int sum(int[]ar){
       int sum=0;
       for(int a:ar ){
           sum=sum+a;
       }
       return sum;
    }


}
