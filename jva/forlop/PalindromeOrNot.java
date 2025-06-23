package jva.forlop;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether its palindrome or not :");
        int num = sc.nextInt();

        int originalNum =num;
        int revrse =0;
        for(;num!=0;num=num/10){
            int digit = num%10;
            revrse=revrse*10+digit;
        }

        if(originalNum==revrse)
            System.out.println("Number is Palindrome ");
        else
            System.out.println("Number is not a Palindrome ");
    }
}
