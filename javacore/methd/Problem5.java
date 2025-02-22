package javacore.methd;

import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        //	4.	void printOdd(int[]), method will print all odd number from supplied array
        int [] arr = {12,23,45,65,76,87,78,98,90,99};
        System.out.println("Arrays are : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Odd number in a given array : ");
        printOdd(arr);

    }

    public static void printOdd(int[] ar){
        for(int a:ar){
           if(a%2!=0){
               System.out.print(a+" ");
           }
        }
    }
}
