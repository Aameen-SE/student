package jva.whilelop;

import java.util.Scanner;

public class CountOfNumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num =sc.nextInt();
        int count =0;
        while (num!=0){
            count++;
            num=num/10;
        }
        System.out.println("Number of digit in a number given is :"+count);
    }
}
