package jva.ternaryoperat;

import java.util.Scanner;

public class GreaterOfTwo {
    public static void main(String[] args) {
        //Find the greater of two numbers using ternary.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();

        int result = (num1>num2)? num1:num2;

        if(result==num1)
            System.out.println("Greater number between two is first number :"+num1);
        else
            System.out.println("Greater number between two is second number :"+num2);

    }
}
