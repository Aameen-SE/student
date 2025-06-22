package jva.forlop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series you want : ");
        int num = sc.nextInt();

        int n1=0,n2=1;

        System.out.print("Fibonacci Series are : \n"+n1+" , "+n2);
        for(int i=2;i<num;i++){
            int fibo = n1+n2;
             n1=n2;
            n2=fibo;
            System.out.print(", "+fibo);
        }
    }
}
