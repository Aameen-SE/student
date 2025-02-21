package javacore.methd;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        //wap to find a number is odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked whether it is odd or even : ");
        int num=sc.nextInt();

        boolean c= checkNum(num);
        if(c==true)
            System.out.println("Even Number ");
        else
            System.out.println("Odd Number ");

    }
    public static boolean checkNum(int n){
        if(n%2==0)
            return true;
        return false;
    }
}
