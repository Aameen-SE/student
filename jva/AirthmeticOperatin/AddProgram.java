package jva.AirthmeticOperatin;

import java.util.Scanner;

public class AddProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the option : \n1. Add two number \n2. Add three number : ");
        int choice = sc.nextInt();

        switch (choice){

            case 1:
                System.out.println("Enter the first number : ");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                int num2 = sc.nextInt();
                addTwoNum(num1,num2);
                break;

            case 2:
                System.out.println("Enter the first number : ");
                int firstNum = sc.nextInt();
                System.out.println("Enter the second number : ");
                int secondNum = sc.nextInt();
                System.out.println("Enter the three number : ");
                int num3 = sc.nextInt();
                addThreeNum(firstNum,secondNum,num3);
                break;


        }

    }
    // //wap to add two numbers?
    public static void addTwoNum(int num1 , int num2){
        System.out.println("Sum of two number : "+(num1+num2));
    }

    //wap to add three numbers?
    public static void addThreeNum(int num1 , int num2, int num3 ){
        System.out.println("Sum of three number : "+(num1+num2+num3));
    }
    }

