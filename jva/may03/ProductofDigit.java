package jva.may03;

import java.util.Scanner;

public class ProductofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int product=1;
        for(;num>0;num=num/10){
            int digit = num%10;
            product = product *digit;
        }
        System.out.println("Product of th given number : "+product);
    }
}
