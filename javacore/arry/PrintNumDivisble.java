package javacore.arry;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumDivisble {
    public static void main(String[] args) {
        //wap to print number divisible by given number from an array

        int[] arr = {12,34,56,76,89,90,76,97,54,31,13,43};
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check which is  divisible by it in array : ");
        int num = sc.nextInt();



        System.out.println("Number divisible by given number in array :");
        for(int a :arr){
            if(a%num==0){
                System.out.print(a+", ");
            }
        }


    }
}
