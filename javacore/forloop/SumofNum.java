package javacore.forloop;

import java.util.Scanner;

public class SumofNum {
    public static void main(String[] args) {
        //wap to find sum of a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int rem , sum =0 ;
        for(int i =num;num!=0;num=num/10){
            rem=num%10;
            sum= sum+rem;
        }
        System.out.println("Sum of the given number is : "+sum);
    }
}
