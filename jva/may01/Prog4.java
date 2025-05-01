package jva.may01;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        //wap to print fibonocci series using while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int n1=0,n2=1;
        System.out.println("Fibonacci Series : ");
        System.out.print(n1+" , "+n2+" , ");
        int fibo;
        int i=3;
        while(i<=num){
            fibo=n1+n2;
            System.out.print(fibo+" , ");
            n1=n2;
            n2=fibo;
            i++;
        }
    }
}
