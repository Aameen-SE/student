package javacore.arry;

import java.util.Arrays;

public class SmallestNuminArr {
    public static void main(String[] args) {
        int[] arr = {34,56,76,89,90,76,54,31,13,43};
        System.out.println(Arrays.toString(arr));

        int small=arr[0];

        for(int i =1;i< arr.length-1;i++){
            boolean b = small>arr[i];

            if(b==true){
                small=arr[i];
            }
        }
        System.out.println("Smallest number in array is : "+small);
    }
}
