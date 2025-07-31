package dailypractice.july31;

//Write a program that takes 2 numbers and divides them. Handle division by zero using try-catch.

import java.util.Scanner;

public class HandleException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number to be divided : ");
        int num2 = sc.nextInt();

        try {
            double result = num1 / num2;
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Program run to the end");
        }
    }
}
