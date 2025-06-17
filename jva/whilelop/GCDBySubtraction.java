package jva.whilelop;

import java.util.Scanner;

public class GCDBySubtraction {
    //GCD using repeated subtraction
    // Greater commom Divisor

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        while(num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }else if(num2>num1){
                num2=num2-num1;
            }
        }

        System.out.println("GCD of both the number is : "+num1);
    }
}
