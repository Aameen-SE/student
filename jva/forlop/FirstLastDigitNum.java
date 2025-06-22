package jva.forlop;

import java.util.Scanner;

public class FirstLastDigitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its first and last digit   : ");
        int num = sc.nextInt();
        int temp = num;
        System.out.println("Original num is : "+num);

        int reverse =0;
        for(;num!=0;num=num/10){
            int digit = num%10;
            reverse=reverse*10+digit;

        }
        int firstDigit = reverse%10;
        int lastDigit = temp%10;
        System.out.println("First digit of the given num is : "+firstDigit);
        System.out.println("Last digit of the given number is : "+lastDigit);


    }
}
