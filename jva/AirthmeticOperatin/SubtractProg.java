package jva.AirthmeticOperatin;

import java.util.Scanner;

public class SubtractProg {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the option : \n1. Subtract two number : \n2. Subtract three num : ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the first number : ");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                int num2 = sc.nextInt();
                subTwoNum(num1,num2);
                break;
            case 2 :
                System.out.println("Enter the first number : ");
                int firstNum = sc.nextInt();
                System.out.println("Enter the second number : ");
                int secondNum = sc.nextInt();
                System.out.println("Enter the three number : ");
                int thirdNum = sc.nextInt();
                subThreeNum(firstNum,secondNum,thirdNum);
                break;
        }
    }

    public static void subTwoNum(int n1, int n2){
        System.out.println("Subtraction of two num is : "+(n1-n2));
    }

    public static void  subThreeNum(int n1, int n2, int n3){
        System.out.println("Subtraction of three num is : "+(n1-n2-n3));
    }

}
