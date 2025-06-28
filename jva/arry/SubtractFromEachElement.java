package jva.arry;

import java.util.Arrays;

public class SubtractFromEachElement {
    public static void main(String[] args) {
        int[] arr={12,14,15,16,18,19,21};
        //wap to subtract -1 from each element of an array
        System.out.println("Before Subtracting : "+Arrays.toString(arr));
        int size = arr.length;


        for(int i=0;i<size;i++){
            arr[i]=arr[i]-1;
        }
        System.out.println("After Subtracting : "+Arrays.toString(arr));
    }
}
