package jva.AirthmeticOperatin;

import java.util.Scanner;

public class AverageProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the option : \n1. Average of two number \n2. Average of three number : ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Enter the first number : ");
                int num1 = sc.nextInt();
                System.out.println("Enter the second number : ");
                int num2 = sc.nextInt();
                avgTwoNum(num1, num2);
                break;

            case 2:
                System.out.println("Enter the first number : ");
                int firstNum = sc.nextInt();
                System.out.println("Enter the second number : ");
                int secondNum = sc.nextInt();
                System.out.println("Enter the third number : ");
                int num3 = sc.nextInt();
                avgThreeNum(firstNum, secondNum, num3);
                break;
        }


    }
    public static void avgTwoNum(int num1 , int num2){
       double avg = num1+num2/2;
        System.out.println("Average of the two given number is : "+avg);
    }


    public static void avgThreeNum(int num1 , int num2, int num3 ){
        double avg = num1+num2+num3/3;
        System.out.println("Average of the three given number is : "+avg);
    }
}
