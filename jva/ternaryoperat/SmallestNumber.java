package jva.ternaryoperat;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3 : ");
        int num3 = sc.nextInt();

        int result = (num1<num2&&num1<num3)? num1 :
                (num2<num1&&num2<num3)? num2 : num3;

        System.out.println("Smallest number between three num is :"+result);

    }
}
