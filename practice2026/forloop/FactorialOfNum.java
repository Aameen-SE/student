package practice2026.forloop;

import java.util.Scanner;

public class FactorialOfNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        fact(num);

    }

    public static void fact(int num){
        int fact=1;
        for(;num>0;num=num/10){
            int digit = num%10;
            fact= fact* digit;
        }
        System.out.println("Factorial of the given number is :"+fact);
    }

}
