package javacore.ternary;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        //	wap to print odd number among two given numbers( with if and without if).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 ");
        int num2 = sc.nextInt();

        int oddNum = num1%2!=0? num1 : num2%2!=0 ?num2:0;
        System.out.println("The Odd Num between two num is :"+oddNum);
    }
}
