package jva.whilelop;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked as palindrome or not : ");
        int num = sc.nextInt();
        int temp =num;
        int reverse =0;

        while(temp!=0){
            int rem = temp%10;
            reverse=reverse*10+rem;
            temp=temp/10;
        }

        if(num==reverse)
            System.out.println("is Palindrome");
        else
            System.out.println("Not a palindrome ");
    }
}
