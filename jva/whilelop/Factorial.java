package jva.whilelop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial : ");
        int num = sc.nextInt();

        int fact =1;
        int i=1;
       while(i<=num)
       {
           fact=fact*i;
           i++;
       }
        System.out.println("Factorial of the given  number is : "+fact);
    }
}
