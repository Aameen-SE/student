package forwhile;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fibonacci Series : ");
        int num = sc.nextInt();

        int n1=0,n2=1;

        System.out.print("Fibonacci Series : "+n1+" , "+n2+" , ");
        int fibo;
        for(int i=2;i<num;i++){
            fibo=n1+n2;
            System.out.print(fibo+" , ");
            n1=n2;
            n2=fibo;
        }
    }
}
