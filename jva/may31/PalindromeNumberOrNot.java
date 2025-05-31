package jva.may31;

import java.util.Scanner;

public class PalindromeNumberOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =sc.nextInt();
        int originalNum = num;
        int reverseNum = 0;

        while (num>0){
            int digit=num%10;
            reverseNum = reverseNum*10+digit;
            num=num/10;
        }

        if(originalNum==reverseNum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number ");


    }
}
