package corejava.aug03;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {

        //wap to print greatest number among two given numbers( with if and without if).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the firstnumber :");
        int num1=sc.nextInt();
        System.out.println("Enter the second num :");
        int num2=sc.nextInt();

        usingIf(num1,num2);
        withoutIf(num1,num2);
    }
    public static void usingIf(int num1, int num2){
        if(num1>num2)
            System.out.println("Greatest num between two num is: "+num1);
        else if(num1==num2)
            System.out.println("Both the number is equal to each other ");
        else
            System.out.println("Greatest num between two num is :"+num2);

    }

    public static void withoutIf(int num1, int num2){
    int greatNum = (num1>num2)? num1:num2;
        System.out.println("Greatest Number between two is "+greatNum);
    }
}
