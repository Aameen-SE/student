package corejava.aug03;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        //wap to print even number among two given numbers( with if and without if).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num :");
        int num1=sc.nextInt();
        System.out.println("Enter the second num :");
        int num2= sc.nextInt();

        usingIf(num1,num2);
        withoutIf(num1,num2);
    }

    public static void usingIf(int num1,int num2){
        if(num1%2==0&&num2%2==0)
            System.out.println("Both the number is even number ");
        else if(num1%2==0)
            System.out.println("Even number between two is "+num1);
        else if(num2%2==0)
            System.out.println("Even number between two is "+num2);
        else
            System.out.println("Both the number is not even ");

    }
    public static void withoutIf(int num1,int num2){
        int evenNum=(num1%2==0)?num1 :(num2%2==0)?num2:0;
        System.out.println("Even number between two is "+evenNum);

    }
}
