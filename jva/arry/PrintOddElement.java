package jva.arry;

import java.util.Arrays;

public class PrintOddElement {
    public static void main(String[] args) {
        int[] arr={12,45,32,54,21,62,74,89,47};
        System.out.println("Odd Element in Array :"+ Arrays.toString(arr)+" are : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" , ");
            }
        }
    }
}
