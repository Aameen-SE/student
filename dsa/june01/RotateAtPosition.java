package dsa.june01;

import java.util.Arrays;

public class RotateAtPosition {
    public static void main(String[] args) {
        //Rotate Array by k Positions

        int[] arr={1,2,3,4,5,6};
        rotateArr(arr,2);
        System.out.println("Rotated Array: " + Arrays.toString(arr));

    }
    public static void rotateArr(int[]arr , int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start , int end){

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

}
