package javacore.ifelse;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        //wap to print even number among two given numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2 :");
        int num2 = sc.nextInt();

        if(num1%2==0&&num2%2==0)
            System.out.println("Both the number is the even number ");
        else if (num1%2==0) {
            System.out.println("num1 :"+num1+" is the even number ");
        } else if (num2%2==0) {
            System.out.println("num2 : "+num2+" is the even number ");
        }
        else
            System.out.println("Both the number is not the even number ");
    }
}
