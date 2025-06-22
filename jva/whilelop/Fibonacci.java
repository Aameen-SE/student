package jva.whilelop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci Series you want : ");
        int num = sc.nextInt();
        int n1=0,n2=1;
        System.out.print("Fibonacci Series \n"+n1+" , "+n2);
        int fibo;
        int i=2;
        while(i<num){
            fibo=n1+n2;
            System.out.print(" , "+fibo);
            n1=n2;
            n2=fibo;
            i++;
        }

    }
}
