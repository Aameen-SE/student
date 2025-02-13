package javacore.forloop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //wap to find factorial of a given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial : ");
        int num = sc.nextInt();
        int fact=1;
        for(int i =num;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of the given number : "+fact);

    }
}
