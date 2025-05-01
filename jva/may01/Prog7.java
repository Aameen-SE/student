package jva.may01;

import java.util.Scanner;

public class Prog7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum=0;
        int i =0;
        while(i<num){
            int lDigit = num%10;
            sum=sum+lDigit;
            num=num/10;
        }
        System.out.println("Sum of the given number is : "+sum);
    }
}
