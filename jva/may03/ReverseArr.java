package jva.may03;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        // reverse the array and copy into another array
        int[] arr = {12,23,43,56,76};
        System.out.println(Arrays.toString(arr));
        int[] reverseArr = new int[arr.length];
        int j=0;

        for (int i= arr.length-1;i>=0;i--){
            reverseArr[j]=arr[i];
            j++;
        }
        System.out.println(Arrays.toString(reverseArr));
    }
}
