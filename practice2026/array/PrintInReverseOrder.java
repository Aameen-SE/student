package practice2026.array;

import java.util.Arrays;

public class PrintInReverseOrder {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println("Arrays : "+ Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
