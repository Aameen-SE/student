package javacore.arry;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        //wap to create and print array using without loop
        int[] arr ={1,2,3};
        System.out.println(arr); // printing the address

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("Using arrays to string ");
        System.out.println(Arrays.toString(arr));

    }
}
