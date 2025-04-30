package jva.april30;

import java.util.Arrays;

public class Prog7 {
    public static void main(String[] args) {
        // reverse array into another array

        int[] arr ={12,45,65,24,35,85,98,64,55};
        System.out.println(Arrays.toString(arr));
        int reverseArr []=new int[arr.length];
        int j =0;
        for(int i=arr.length-1;i>=0;i--){
            reverseArr[j]=arr[i];
            j++;
        }
        System.out.println("Reverse array : "+Arrays.toString(reverseArr));


    }
}
