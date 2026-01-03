package practice2026.forloop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        reverseNum(num);
    }
    public static void reverseNum(int num){
        int reverse =0;
        for(int i=num;i>0;i=i/10){
            int digit = num%10;
            reverse= reverse*10+digit;
            num=num/10;
        }

        System.out.println("Reverse of the given number is : "+reverse);
    }
}
