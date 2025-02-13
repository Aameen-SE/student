package javacore.forloop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //wap to reverse a number e.g ip=12345, op=54321 avoid zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        int num = sc.nextInt();
       int reverse =0;
       int rem ;

       for(;num!=0;num=num/10){
           rem=num%10;
           reverse=reverse*10+rem;

       }
        System.out.println("Reverse of the given number is :"+reverse);
    }
}
