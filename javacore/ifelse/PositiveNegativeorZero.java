package javacore.ifelse;

import java.util.Scanner;

public class PositiveNegativeorZero {
    public static void main(String[] args) {
        //wap to find a number is negative or positive or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num==0)
            System.out.println("Num is zero ");
        else if (num>0) {
            System.out.println("Number is positive ");
        }
        else
            System.out.println("Number is negative");
    }
}
