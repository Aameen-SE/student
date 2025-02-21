package javacore.methd;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        //Wap to check whether a number is Prime number or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num to check whether it is prime or not :");
        int num=sc.nextInt();

        checkPrime(num);

    }
    public static void checkPrime(int n){
        if(n==1&&n==2&&n==3){
            System.out.println("Prime Number ");
        } else if (n%2!=0) {
            System.out.println("Prime Number ");
        }
        else
            System.out.println("Not a Prime Number ");
    }
}
