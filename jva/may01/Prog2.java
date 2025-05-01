package jva.may01;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        //wap to find factorial of a given number using while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is : ");
        int num=sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=num){
            fact=fact*i;
        i++;
        }
        System.out.println("Factorial of the given number is :"+fact);

    }
}
