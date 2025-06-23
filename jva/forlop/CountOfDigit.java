package jva.forlop;

import java.util.Scanner;

public class CountOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count its digit ");
        int num = sc.nextInt();
        int count=0;
        for(;num!=0;num=num/10){
            count++;
        }
        System.out.println("No of the digit in the given number is : "+count);
    }
}
