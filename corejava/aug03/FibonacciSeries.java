package corejava.aug03;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of Fibonacci Series required :");
        int num = sc.nextInt();
        int num1=0,num2=1;
        System.out.print("Fibonacci Series : "+num1 +" ,"+num2+" , ");
        for(int i=3;i<=num;i++)
        {
            int fibo=num1+num2;
            System.out.print(fibo+" , ");
            num1=num2;
            num2=fibo;
        }


    }
}
