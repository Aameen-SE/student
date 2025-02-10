package javacore.ifelse;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        //wap to find which number is greater among three numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 :");
        int num2 = sc.nextInt();
        System.out.println("Enter the number3 :");
        int num3 = sc.nextInt();

        if(num1>num2 &&num1>num3)
            System.out.println("Num1 : "+num1+" is the greatest among them");
        else if (num2>num1&&num2>num3) {
            System.out.println("Num2 :"+num2+" is the greatest among them ");
        }
        else
            System.out.println("Num3 :"+num3+" is the greatest among them");
    }
}
