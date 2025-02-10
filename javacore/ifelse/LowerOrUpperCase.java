package javacore.ifelse;

import java.util.Scanner;

public class LowerOrUpperCase {
    public static void main(String[] args) {
        //	13.	Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char c = sc.next().charAt(0);
        if(c>='a'&&c<='z')
            System.out.println("Character is lower case ");
        else if (c>='A'&&c<='Z') {
            System.out.println("Character is upper case ");
        }
        else
            System.out.println("Given Character is not a character ");
    }
}
