package javacore.forloop;

import java.util.Scanner;

public class PrintNaturalNum {
    public static void main(String[] args) {
        //Wap to print all natural numbers from 1 to n.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int num= sc.nextInt();
        System.out.println("The natural number from 1 to "+num+" is :");
        for(int i =1;i<=num;i++){
            System.out.print(i+" ");
        }
    }
}
