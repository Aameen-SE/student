package javacore.forloop;

import java.util.Scanner;

public class FactorialofNum {
    public static void main(String[] args) {
        //Wap to calculate factorial of a number.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int fact=1;

        for(int i =1;i<=num;i++){
        fact=fact*i;

        }
        System.out.println("Factorial of the given num is :"+fact);
    }
}
