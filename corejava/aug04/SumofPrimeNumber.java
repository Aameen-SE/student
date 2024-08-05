package corejava.aug04;

import java.util.Scanner;

public class SumofPrimeNumber {
    //Wap to find sum of all prime numbers between 1 to n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int sum=2+3;
        for(int i=4;i<=num;i++){
          if (i%2!=0&&i%3!=0) {
               sum=sum+i;
           }

        }
        System.out.println("Sum of the prime nuber upto n:"+num+" is :"+sum);
    }

}
