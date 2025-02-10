package javacore.ifelse;

import java.util.Scanner;

public class DivisibleorNot {
    public static void main(String[] args) {
        //wap to find whether a number is divisible by a given number completely.
        int number = 846;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check whether number : "+number+" is completely divisible or not ");
        int givenNum = sc.nextInt();

        if(number%givenNum==0)
            System.out.println("Yes, the number : "+number+" is divisible completely by givenNumner :"+givenNum);
        else
            System.out.println("No, the number : "+number+" is not divisible completely by givenNumner :"+givenNum);
    }
}
