package javacore.arry;

import java.util.Arrays;

public class CheckSameTwoArray {
    public static void main(String[] args) {
        //wap to check whether two array are equal or not
        int[] arr = {1,12,13,45,65,78,90,89,88,53,47};
        int[] arr2 = {1,12,13,45,65,78,90,89,88,53,47};

        System.out.print("1. Array : ");
        System.out.println(Arrays.toString(arr));
        System.out.print("2. Array : ");
        System.out.println(Arrays.toString(arr2));

        boolean equal =true ;
        for (int i =0;i<arr.length;i++){
            if(arr[i]==arr2[i]){
            equal=true;
            }
            else
                equal=false;
        }

        if(equal==true){
            System.out.println("Both the Arrays are equal ");
        }
        else
            System.out.println("Both the arrays are not equal to each other ");


    }
}
