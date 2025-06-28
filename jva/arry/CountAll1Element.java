package jva.arry;

import java.util.Arrays;

public class CountAll1Element {
    public static void main(String[] args) {
        //wap to count all 1's of an int array
        //		Suppose given array is [10, 19, 2, 7] -> number of 1's here zero
        int arr[]={10, 19, 2, 7};
        System.out.println("Arrays : "+ Arrays.toString(arr));
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
        }
        System.out.println("Count of 1s in array : "+count);
    }
}
