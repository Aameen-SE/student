package corejava.aug03;

import java.util.Scanner;

public class Divby7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num%7==0)
            System.out.println("num :"+num+" , Yes it is divisible by 7");
        else
            System.out.println("num :"+num+" , No it is not divisible by 7");
    }
}
