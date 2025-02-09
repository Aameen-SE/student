package javacore.ifelse;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        //wap to print positive number among two given numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 is :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 is :");
        int num2 = sc.nextInt();

        if(num1>0&& num2>0)
            System.out.println("Both the number is positive number ");
        else if (num1>0) {
            System.out.println("Num1 :"+num1+" is the postive number ");
        } else if (num2>0) {
            System.out.println("Num2 :"+num2+" is the positive number ");
        }
        else
            System.out.println("Both the number is the negative number ");
    }
}
