package jva.may23;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n1=0;
        int n2=1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nummber of fibonacci series needed : ");
        int num = sc.nextInt();
        System.out.print("Fibonacci Series : "+n1+" , "+n2+" , ");
        int fibo ;
        for(int i=2;i<num;i++){
            fibo=n1+n2;
            System.out.print(fibo+" , ");
             n1=n2;
             n2=fibo;
        }
    }
}
