package arrayy;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr ={12,13,14,15,16,17};
        System.out.println("Element : "+Arrays.toString(arr));
        int[] reverseArr = new int[arr.length];

        int j=0;
        for(int i =arr.length-1;i>=0;i--){
            reverseArr[j]=arr[i];
            j++;
        }

        System.out.println("ReverseArray : "+ Arrays.toString(reverseArr));
    }
}
