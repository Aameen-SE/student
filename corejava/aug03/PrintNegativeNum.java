package corejava.aug03;

import java.util.Scanner;

public class PrintNegativeNum {
    public static void main(String[] args) {
        //wap to print negative number among two given numbers( with if and without if).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num ");
        int num1=sc.nextInt();
        System.out.println("Enter the second num ");
        int num2= sc.nextInt();

        usingIf(num1,num2);
        withoutIf( num1, num2);
    }
    public static void usingIf(int num1,int num2){
        if(num1<0&&num2<0)
            System.out.println("Both the number is negative");
      else  if(num1<0)
            System.out.println("Negative number between two is "+num1);
        else if (num2<0) {
            System.out.println("Negative number between two is "+num2);
        }
        else if(num1>0&&num2>0)
            System.out.println("Both the number is positive ");
    }

    public static void withoutIf(int num1,int num2){
        int negativeNum = (num1 < 0) ? num1 : (num2 < 0) ? num2 : 0;
        System.out.println("Negative number between two is "+negativeNum);

    }
}
