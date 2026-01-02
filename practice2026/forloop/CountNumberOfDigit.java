package practice2026.forloop;

import java.util.Scanner;

public class CountNumberOfDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        countDigit(num);
    }

    public static void countDigit(int num){
        int count =0;

        for (;num>0;num=num/10){
            count++;
        }
        System.out.println("No of digit is : "+count);

    }
}
