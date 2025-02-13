package javacore.forloop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        //wap to find given number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check it is prime or not : ");
        int num = sc.nextInt();

        if(num==1||num==2||num==3){
            System.out.println("Given Number :"+num+" is Prime number ");
        }
        else if(num%2==0||num%3==0){
            System.out.println("Given Number: "+num +" is not prime ");
        }
        else {
            System.out.println("Given Number : "+num+" is a prime number ");
        }
    }
}
