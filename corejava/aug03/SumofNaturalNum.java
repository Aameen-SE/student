package corejava.aug03;

import java.util.Scanner;

public class SumofNaturalNum {
    //Wap to find sum of all natural numbers between 1 to n.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where to be sum:");
        int num = sc.nextInt();

        int sum=0;

        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of the natural number from 1 to n :"+num+" is :"+sum);
    }
}
