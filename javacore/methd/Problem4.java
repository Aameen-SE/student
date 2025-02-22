package javacore.methd;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        //void printEven(int[]), method will print all even number from supplied array
        int [] arr = {12,23,45,65,76,87,78,98,90,99};
        System.out.println("Arrays are : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Even number in a given array are :");
        printEven(arr);

    }
    public static void printEven(int[] ar){
        for(int a:ar){
            if(a%2==0){
                System.out.print(a+" ");
            }
        }
    }
}
