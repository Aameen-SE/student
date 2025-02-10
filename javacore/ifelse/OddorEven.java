package javacore.ifelse;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        //wap to find a number is odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is :");
        int num = sc.nextInt();
        if(num==1)
            System.out.println("Num : "+num+" is the odd number ");
        else if (num%2==0) {
            System.out.println("Num :"+num+" is the even number ");
        }
        else
            System.out.println("Num : "+num+" is the odd number ");
    }
}
