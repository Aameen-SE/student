package practice2026.forloop;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of fibonacci : ");
        int num =sc.nextInt();

        fibo(num);
    }

    public static void fibo(int num){

        int num1 = 0;
        int num2 =1;
        int fibo;
        System.out.print("Fibonacci Series : \n "+num1 +" ,"+num2+" ,");

        for(int i=3;i<=num;i++){
            fibo = num1+num2;
            System.out.print(fibo+" , ");
            num1=num2;
            num2=fibo;
        }
    }
}
