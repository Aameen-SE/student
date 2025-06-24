package jva.arry;

import java.util.Arrays;

public class PrintReverseArray {
    public static void main(String[] args) {
        int[] arr={12,45,32,54,21,62,74,89,47};
        System.out.println("Original Arrays : "+ Arrays.toString(arr));

        int size = arr.length;
        int[] reverse=new int[size];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            reverse[j]=arr[i];
            j++;
        }
        System.out.println("Reverse Arrays : "+ Arrays.toString(reverse));
    }
}
