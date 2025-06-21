package jva.ifelse;

import java.util.Scanner;

public class CheckDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked :");
        int num = sc.nextInt();
        System.out.println("Enter the number to be check the given number is divisble or not ");
        int divNum= sc.nextInt();

        if(num%divNum==0)
            System.out.println("Num : "+num+" is Divisible by given Num :"+divNum);
        else
            System.out.println("Num : "+num+" is not Divisible by given Num :"+divNum);
    }
}
