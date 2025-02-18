package javacore.arry;

import java.util.Arrays;

public class PrintinReverseOrder {
    public static void main(String[] args) {
        //wap to print array in reverse order
        int[] arr = {12,34,56,76,89,90,76,97,54,31,13,43};
        System.out.println(Arrays.toString(arr));
        System.out.println("Printing the arrays in reverse order : ");
        for(int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+", ");
        }
    }
}
