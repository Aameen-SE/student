package javacore.arry;

import java.util.Arrays;

public class CopyOneArrintoAnother {
    public static void main(String[] args) {
        //wap to copy one array into other array
        int[] arr = {12,34,56,76,89,90,76,97,54,31,13,43};
        System.out.println(Arrays.toString(arr));

        System.out.println("\nCopying one Array into Another : ");

        int arr2[]=new int[arr.length];
        for(int i =0;i< arr.length;i++){
            arr2[i]=arr[i];
            System.out.print(arr2[i]+", ");
        }
    }
}
