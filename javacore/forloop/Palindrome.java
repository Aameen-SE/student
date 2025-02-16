package javacore.forloop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //Wap to check whether a number is palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int originalNum=sc.nextInt();
        int num=originalNum;
        int rem,rev=0;

        for(;num!=0;){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse num : "+rev);
        if(originalNum==rev){
            System.out.println(originalNum+": is a palindrome number ");
        }
        else
            System.out.println(originalNum+" is not a palindrome number ");

    }
}
