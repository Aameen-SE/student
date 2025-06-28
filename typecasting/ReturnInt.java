package typecasting;

import java.util.Scanner;

public class ReturnInt {
    public static void main(String[] args) {
        //Write a method that takes double and pass it an int result of a calculation.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1 :");
        double num1 =sc.nextDouble();
        System.out.println("Enter the num2 : ");
        double num2 = sc.nextDouble();
        int result = addNum(num1,num2);
        System.out.println("Result : "+result);
    }
    public static int addNum(double num1, double num2){

        int result = (int)(num1+num2);

        return result;
    }
}
