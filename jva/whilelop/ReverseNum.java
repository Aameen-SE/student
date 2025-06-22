package jva.whilelop;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        int num = sc.nextInt();
        int temp =num;
        int reverse =0;
        if(num<10){
            System.out.println("Single digit cannot be reversed as it will print the same thing : "+num);
        } else if (num>=10) {
            while(num!=0){
                int digit = num%10;
                reverse=reverse*10+digit;
                num=num/10;
            }
        }
        System.out.println("Reverse of the given num : "+temp+" is : "+reverse);
    }
}
