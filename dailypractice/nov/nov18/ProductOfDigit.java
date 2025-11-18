package dailypractice.nov.nov18;

import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num = sc.nextInt();
        productOfDigit(num);
    }
    public static void productOfDigit(int num){
        int product =1;

        while(num>0){
            product= product * (num%10);
            num=num/10;
        }
        System.out.println("Sum of digit in the number is :"+product);
    }
}
