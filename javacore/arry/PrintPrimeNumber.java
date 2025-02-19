package javacore.arry;

import java.util.Arrays;

public class PrintPrimeNumber {
    public static void main(String[] args) {
        //wap to print all prime numbers from an array ?

        int[] arr = {1,12,13,45,65,78,90,89,88,53,47};
        System.out.print("Arrays : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Prime Number in Arrays are : ");
        for(int i =0;i< arr.length;i++){
            if(arr[i]==1&&arr[i]==2&&arr[i]==3){
                System.out.println(arr[i]+" , ");
            } else if (arr[i]%2!=0&&arr[i]%3!=0) {
                System.out.print(arr[i]+" , ");
            }

        }



    }
}
