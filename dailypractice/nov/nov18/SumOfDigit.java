package dailypractice.nov.nov18;

import java.util.Scanner;

public class SumOfDigit {
    //Wap to calculate sum of digits of a number.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num = sc.nextInt();
        sumOfDigit(num);

    }
    public static void sumOfDigit(int num){
        int sum =0;

        while(num>0){
           sum= sum + (num%10);
            num=num/10;
        }
        System.out.println("Sum of digit in the number is :"+sum);
    }


}
