package practice2026.forloop;

import java.util.Scanner;

public class ProductOfDigitOfNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();

        product(num);
    }
    public static void product(int num){
       int product =1;
        for(int i=num;i>0;i=i/10){
            int digit = num%10;
            product=product*digit;
            num=num/10;
        }
        System.out.println("Product of the digit of the number :"+product);

    }
}
