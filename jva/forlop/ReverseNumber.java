package jva.forlop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reveresed : ");
        int num = sc.nextInt();
        int reverse =0;
        int temp= num;
        for(;num!=0;num=num/10){
            int digit =num%10;
            reverse=reverse*10+digit;
        }
        System.out.println("Reverse of the given number : "+temp+" is : "+reverse);
    }
}
