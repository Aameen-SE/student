package javacore.forloop;

import java.util.Scanner;

public class SumofFirstandLastDigit {
    public static void main(String[] args) {
        //Wap to find sum of first and last digit of a number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int lastDigit = num%10;
        int firstDigit = num;
        for(;firstDigit>=10;){
            firstDigit=firstDigit/10;
        }
        System.out.println("First Digit of the num is "+firstDigit);
        System.out.println("Last Digit of the num is "+lastDigit);

        int sum = firstDigit+lastDigit;
        System.out.println("Sum of the first digit and last digit is : "+sum);
    }
}
