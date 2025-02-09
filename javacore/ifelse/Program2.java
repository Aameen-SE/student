package javacore.ifelse;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        //	2.	wap to print smallest number among two given numbers( with if and without if).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 :");
        int num2 = sc.nextInt();

        if(num1<num2)
            System.out.println("Num1 : "+num1+" is the smallest number ");
        else if (num2<num1) {
            System.out.println("Num2 : "+num2+" is the smallest number ");
        }
        else
            System.out.println("Both the number is equal to each other ");
    }
}
