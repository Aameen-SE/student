package javacore.ifelse;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        //	54. 	Wap to print kid if age<13, print teenage if age<18 and age>12, and adult if age>18
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  age :");
        int age = sc.nextInt();

        if(age<13)
            System.out.println("Kid");
        else if (age>=13&&age<18) {
            System.out.println("Teenage");
        }
        else
            System.out.println("Adult");
    }
}
