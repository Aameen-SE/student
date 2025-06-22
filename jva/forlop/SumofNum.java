package jva.forlop;

import java.util.Scanner;

public class SumofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its sum : ");
        int num = sc.nextInt();
        int temp=num;
        int sum=0;

        for(;num!=0;num=num/10){
            int digit = num%10;
            sum= sum+digit;
        }
        System.out.println("Sum of the given number is : "+temp+" is : "+sum);
    }
}
