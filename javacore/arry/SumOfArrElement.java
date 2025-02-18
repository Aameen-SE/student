package javacore.arry;

import java.util.Arrays;

public class SumOfArrElement {
    public static void main(String[] args) {
        //wap to find sum of an array element
        int[] arr = {12,34,56,76,89,90,76,97,54,31,13,43};
        System.out.println(Arrays.toString(arr));

        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        System.out.println("sum of an array in element : "+sum);

    }
}
