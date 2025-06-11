package jva.ternaryoperat;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Check whether a number is even or odd using ternary operator.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();

        int result = (num%2==0)?1:0;

        if(result==1)
            System.out.println("Even Number ");
        else
            System.out.println("Odd Number ");


    }
}
