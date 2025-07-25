package arrayy;

import java.util.Arrays;

public class CopyOneArrayintoAnother {

    public static void main(String[] args) {

        int[] arr = {12,15,16,17,18,19,111};
        System.out.println("Original Arrays : "+ Arrays.toString(arr));

        int newArr[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }

        System.out.println("New Array after copying from original : "+Arrays.toString(newArr));
    }
}
