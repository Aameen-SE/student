package javacore.ifelse;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        //wap to print odd number among two given numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int num1 =sc.nextInt();
        System.out.println("Enter the number2 :");
        int num2 = sc.nextInt();

        if(num1%2!=0&&num2%2!=0)
            System.out.println("Both the number is odd number ");
        else if (num1%2!=0)
            System.out.println("num1 :"+num1+" is the odd number ");
        else if (num2%2!=0) {
            System.out.println("numn2 : "+num2+" is the odd number ");
        }
        else
            System.out.println("Both the number is not the odd number ");
    }
}
