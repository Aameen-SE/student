package jva.may03;

import java.util.Scanner;

public class FactofNum {
    public static void main(String[] args) {
        // factorial of the number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial :");
        int num = sc.nextInt();
        printFact(num);
        printFact(num);
    }
    // using for loop
    public static void printFact(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the given number is :  "+fact);
    }

    // using while loop
    public static void factPrint(int num){
        int fact=1;
        int i=2;
        while(i<=num){
            fact=fact*num;
            i++;
        }
        System.out.println("Factorial of the number is : "+fact);
    }
}
