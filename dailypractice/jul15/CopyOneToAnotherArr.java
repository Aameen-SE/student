package dailypractice.jul15;

import java.util.Arrays;

public class CopyOneToAnotherArr {

    public static void main(String[] args) {

        int[] arr = {12,14,15,16,17,18,19};
        System.out.println("Original Array : "+ Arrays.toString(arr));

        int [] newArr = new int[arr.length];

        for(int i=0;i<arr.length;i++){
        newArr[i]=arr[i];
        }
        System.out.println("New Array : "+ Arrays.toString(newArr));
    }
}
