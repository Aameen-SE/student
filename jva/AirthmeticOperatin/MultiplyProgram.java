package jva.AirthmeticOperatin;

import java.util.Scanner;

public class MultiplyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the option : \n1. Multiply two number \n2. Multiply three number : ");
        int choice = sc.nextInt();

        switch (choice){

            case 1:
                System.out.println("Enter the first number : ");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                int num2 = sc.nextInt();
                multiTwoNum(num1,num2);
                break;

            case 2:
                System.out.println("Enter the first number : ");
                int firstNum = sc.nextInt();
                System.out.println("Enter the second number : ");
                int secondNum = sc.nextInt();
                System.out.println("Enter the third number : ");
                int num3 = sc.nextInt();
                multiThreeNum(firstNum,secondNum,num3);
                break;


        }
    }


    public static void multiTwoNum(int num1 , int num2){
        System.out.println("Multiply of two number : "+(num1*num2));
    }


    public static void multiThreeNum(int num1 , int num2, int num3 ){
        System.out.println("Multiply of three number : "+(num1*num2*num3));
    }
}
