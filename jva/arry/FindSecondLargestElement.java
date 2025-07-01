package jva.arry;

import java.util.Arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr ={12,77,23,34,54,67,89};
        System.out.println("Arrays : "+ Arrays.toString(arr));
        int firstLargest =arr[0];
        int secondLArgest=0 ;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>firstLargest){
                secondLArgest= firstLargest;
                firstLargest=arr[i];
            }
        }
        System.out.println("Second Largest element in array :"+secondLArgest);
    }
}
