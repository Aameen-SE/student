package jva.ifelse;

import java.util.Scanner;

public class CheckDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num =sc.nextInt();
        if (num<0)
            System.out.println("Number is in negative ");
        else if(num<10)
            System.out.println("Single digit num  ");
        else if (num>=10&&num<100)
            System.out.println("Double digit num ");
        else if(num>=100&&num<1000)
            System.out.println("Ternary digit num");
        else
            System.out.println("Greater than 3 digit num");

    }
}
