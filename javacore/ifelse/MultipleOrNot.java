package javacore.ifelse;

import java.util.Scanner;

public class MultipleOrNot {
    public static void main(String[] args) {
        //wap to find a number is multiple of 10 or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked whether it is multiple of 10 or not :");
        int num = sc.nextInt();

        if(num%10==0)
            System.out.println("Number : "+num+" is the divisible of 10 ");
        else
            System.out.println("Number : "+num+" is not the divisble of 10 ");
    }
}
