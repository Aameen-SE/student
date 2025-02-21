package javacore.methd;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //factorial of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial : ");
        int num = sc.nextInt();

        printFact(num);

    }
    public static void printFact(int n){
        int fact=1;
        for(int i=n;i>=2;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of a given num is :"+fact);
    }
}
