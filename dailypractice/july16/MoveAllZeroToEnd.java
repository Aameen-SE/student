package dailypractice.july16;

import java.util.Arrays;

public class MoveAllZeroToEnd {

    //Write a Java method to move all zeroes in an array to the end, maintaining the order of non-zero elements.

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};
        System.out.println("Original Arrays : "+Arrays.toString(arr));
        int pos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }

        while (pos<arr.length){
            arr[pos]=0;
            pos++;
        }
        System.out.println("Array after moving zero : "+ Arrays.toString(arr));
    }
}
