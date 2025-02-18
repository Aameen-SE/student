package javacore.arry;

import java.util.Arrays;

public class CopyArrInReverseOrder {
    public static void main(String[] args) {
        //wap to copy an array to another array in reverse order

        int[] arr = {12,34,56,76,89,90,76,97,54,31,13,43};
        System.out.println(Arrays.toString(arr));

        int temp[] = new int[arr.length];
        int arr2[]=new int[arr.length];
        System.out.println("Printing the array in reverse order ");
        for(int i= arr.length-1;i>=0;i--){
           int j =0;
           arr2[j]=arr[i];
            System.out.print(arr2[j]+"; ");
           j++;

        }

    }
}
