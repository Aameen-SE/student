package jva.may03;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int reverseNum=0;
        for(;num>0;num=num/10){
            int lDigit = num%10;
            reverseNum=reverseNum*10+lDigit;
        }
        System.out.println(reverseNum);
    }
}
