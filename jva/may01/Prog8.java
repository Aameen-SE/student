package jva.may01;

import java.util.Arrays;

public class Prog8 {
    public static void main(String[] args) {
        //reverse of the array into another array

        int[] arr ={12,23,43,54,67,76,89};
        System.out.println("Original Array : "+Arrays.toString(arr));
        int []revArr= new int[arr.length];
        int j=0;
        for(int i= arr.length-1;i>=0;i--){
            revArr[j]=arr[i];
            j++;
        }
        System.out.println("Reverse Array : "+ Arrays.toString(revArr));
    }
}
