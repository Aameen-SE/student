package jva.ifelse;

import java.util.Scanner;

public class MultipleOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =sc.nextInt();

        if(num%10==0)
            System.out.println("It is a divisible of 10");
        else
            System.out.println("It is not divisible by 10");
    }
}
