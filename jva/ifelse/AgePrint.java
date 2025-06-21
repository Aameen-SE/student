package jva.ifelse;

import java.util.Scanner;

public class AgePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        if(age<13)
            System.out.println("Kid");
        else if (age<17) {
            System.out.println("Teen");
        }
        else
            System.out.println("Adult");


    }
}
