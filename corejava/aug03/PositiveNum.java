package corejava.aug03;

import java.util.Scanner;

public class PositiveNum {
    public static void main(String[] args) {
        //wap to print positive number among two given numbers( with if and without if).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1=sc.nextInt();
        System.out.println("Enter the second number :");
        int num2=sc.nextInt();

        usingIf(num1,num2);
        withoutIf(num1, num2);
    }
    public static void usingIf(int num1,int num2){
        if(num1>0&&num2>0)
            System.out.println("Both the number is positive");
        else  if(num1>0)
            System.out.println("Positive number between two is "+num1);
        else if (num2>0) {
            System.out.println("Positive number between two is "+num2);
        }
        else if(num1<0&&num2<0)
            System.out.println("Both the number is negative ");
    }

    public static void withoutIf(int num1,int num2){
        int positiveNum = (num1>0)?num1 :(num2>0)?num2:0;
        System.out.println("Positive number between two is "+positiveNum);
    }
}
