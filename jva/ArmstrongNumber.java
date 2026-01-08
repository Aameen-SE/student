package jva;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt(); // 123
        int originalNum=num;//123
        int sum =0;
        while(num>0){
            int digit = num%10;
            sum= sum+ digit*digit*digit;
           num=num/10;
        }

        if(sum==originalNum) {
            System.out.println("Armstrong num");
        }
        else {
            System.out.println("Is Not Armstrong num");
        }
    }

}
