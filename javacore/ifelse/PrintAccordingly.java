package javacore.ifelse;

import java.util.Scanner;

public class PrintAccordingly {
    public static void main(String[] args) {
        //Wap to print zero if number zero, 1 if positive and -1 if number is negative
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check and print zero if number is zero, 1 if positive and -1 if number is negative  :");
        int num = sc.nextInt();

        if(num==0)
            System.out.println("Zero");
        else if (num>=0) {
            System.out.println("1");
        }
        else
            System.out.println("-1");
    }
}
