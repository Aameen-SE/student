package javacore.forloop;

import java.util.Scanner;

public class SumofAllEvenNum {
    public static void main(String[] args) {
        //Wap to find sum of all even numbers between 1 to n.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value to find the sum of all the even number between 1 to n : ");
        int num = sc.nextInt();
        int sum =0;
        System.out.println("Even Number from 1 to "+num+" is : ");
        for(int i =1;i<=num;i++){
            if(i%2==0){

                System.out.print(i+" ");
                sum= sum+i;
            }
        }
        System.out.println("\nSum of all the even number from 1 to "+num+" is : "+sum);
    }
}
