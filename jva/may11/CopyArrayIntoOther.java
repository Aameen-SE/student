package jva.may11;

import java.util.Arrays;

public class CopyArrayIntoOther {
    public static void main(String[] args) {
        int[] arr = {12,32,43,54,67,88,97};
        System.out.println("First Array"+Arrays.toString(arr));
         int[] copyArr = new int[arr.length];

         for(int i=0;i<arr.length;i++){
             copyArr[i]=arr[i];
         }

        System.out.println("Copy Array : "+Arrays.toString(copyArr));

    }
}
