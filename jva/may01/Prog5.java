package jva.may01;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        //wap to find given number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if(num<2){
            isPrime=false;
        }else {
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println(num+" is a prime number ");
        else
            System.out.println(num+" is not a prime number ");
    }
}
