package corejava.aug03;

import java.util.Scanner;

public class DivisibleorNot {
    public static void main(String[] args) {
        //wap to find whether a number is divisible by a given number completely.

        int num =75;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be divide the number "+num);
        int givenNum1 = sc.nextInt();

        if(num%givenNum1==0)
            System.out.println("Number "+num+" is  divisble by a given number :"+givenNum1);
        else
            System.out.println("Number "+num+" is not divisble by a given number :"+givenNum1);
    }
}
