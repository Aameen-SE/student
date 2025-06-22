package jva.whilelop;

import java.util.Scanner;

public class FirstLastDigitNum {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its last and first digit : ");
        int num = sc.nextInt();
        int temp =num;
        int reverse = 0;

        int lastDigit = temp%10;

        while(num!=0){
            int digit = num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }

        int firstDigit= reverse%10;
        System.out.println("First Digit of the number is  "+firstDigit);
        System.out.println("Last Digit of the number is  "+lastDigit);

    }
}
