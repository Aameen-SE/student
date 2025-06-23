package jva.forlop;

import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the odd number from 1 to num : ");
        int num = sc.nextInt();
        int sum =0;
        for(int i=0;i<=num;i++){
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of all the odd number from 1 to "+num+" is "+sum);
    }
}
