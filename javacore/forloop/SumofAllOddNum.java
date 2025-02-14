package javacore.forloop;

import java.util.Scanner;

public class SumofAllOddNum {
    public static void main(String[] args) {
        //Wap to find sum of all odd numbers between 1 to n.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value to find the sum of all the odd number between 1 to n : ");
        int num = sc.nextInt();
        int sum =0;
        System.out.println("Odd Number from 1 to "+num+" is : ");

        for(int i = 1;i<=num;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println("\nSum of all the odd num is : "+sum);
    }
}
