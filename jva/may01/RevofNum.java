package jva.may01;

import java.util.Scanner;

public class RevofNum {
    public static void main(String[] args) {
        // reverse of the num num=1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is :");
        int num=sc.nextInt();
        int revNum =0;
        for(;num>0;num=num/10){
            int lastDigit = num%10;
            revNum=revNum*10+lastDigit;
        }
        System.out.println(revNum);
    }
}
