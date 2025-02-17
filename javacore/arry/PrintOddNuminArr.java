package javacore.arry;

import java.util.Arrays;

public class PrintOddNuminArr {
    public static void main(String[] args) {
        //wap to print only odd numbers from an array
        int arr[]={12,45,56,32,87,95,48,32};
        System.out.println(Arrays.toString(arr));

        System.out.println("Odd Number is array :");
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" , ");
            }
        }
    }
}
