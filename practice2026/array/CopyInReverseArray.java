package practice2026.array;

import java.util.Arrays;

public class CopyInReverseArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        System.out.println("Original Array : "+Arrays.toString(arr));
        int[] rever = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            rever[j]=arr[i];
            j++;
        }
        System.out.println("ReverseArray : "+ Arrays.toString(rever));
    }
}
