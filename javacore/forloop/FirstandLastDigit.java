package javacore.forloop;

import java.util.Scanner;

public class FirstandLastDigit {
    public static void main(String[] args) {
        //Wap to find first and last digit of a number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int lastDigit = num%10;
        System.out.println("Last Digit of the given number "+num +" is  : "+lastDigit);

        int firsDigit = num;
        for(;firsDigit>=10;){
            firsDigit=firsDigit/10;
        }
        System.out.println("First Digit of the given number "+num +" is  : "+firsDigit);
    }
}
