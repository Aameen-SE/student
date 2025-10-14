package dailypractice.oct.oct14;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series you want :");
        int num = sc.nextInt();
        int num1=0,num2=1;

        int fibo ;
        System.out.println("Fibonacci series : \n"+num1+" , "+num2+" , ");
        for(int i=2;i<num;i++){
            fibo=num1+num2;
            System.out.print(fibo+" , ");
            num1=num2;
            num2=fibo;
        }

    }
}
