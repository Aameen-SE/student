package dsa.june01;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={14,52,36,74,15,25,4};
        System.out.println("Original Array :"+ Arrays.toString(arr));


        int []reverseArr = new int[arr.length] ;
        int j=0;
        for(int i =arr.length-1;i>=0;i--){
            reverseArr[j]=arr[i];
            j++;
        }
        System.out.println("Reverse Array :"+ Arrays.toString(reverseArr));
    }
}
