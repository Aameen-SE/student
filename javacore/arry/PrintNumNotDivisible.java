package javacore.arry;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumNotDivisible {
    public static void main(String[] args) {
        //wap to print number not divisible by given number from an array

        int[] arr = {12,34,56,76,89,90,76,97,54,31,13,43};
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check which is not divisible by it in array : ");
        int num = sc.nextInt();

        System.out.println("Printing the number that is not divisible by given num : ");
        for(int i =0;i<arr.length;i++){
            if(arr[i]%num!=0){
                System.out.print(arr[i]+" , ");
            }
        }

    }
}
