package javacore.ternary;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //wap to print positive number among two given numbers( with if and without if).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 :");
        int num2 = sc.nextInt();

        int result = num1>0?num1:num2;
        System.out.println("Positive Number between two num is : "+result);
    }
}
