package corejava.aug03;

import java.util.Scanner;

public class CheckAlpha {
    public static void main(String[] args) {
        //Write a program to check whether a given character is lowercase ( a to z ) or uppercase ( A to Z ).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sc.next().charAt(0);

        if(ch>='A' && ch<='Z')
            System.out.println("UpperCase");
        else if (ch>='a'&& ch<='z') {
            System.out.println("LowerCase");
        }
        else
            System.out.println("Its not a character");
    }
}
