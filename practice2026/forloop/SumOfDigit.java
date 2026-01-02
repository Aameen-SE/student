package practice2026.forloop;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        sumOfDigit(num);
    }

    public static void sumOfDigit(int num){
      int sum =0;
        for (int i =num;i>0;i=i/10){
            int digit = num%10;
            sum=sum+digit;
            num=num/10;
        }
        System.out.println("Sum of the digit of the number is : "+sum);
    }
}
