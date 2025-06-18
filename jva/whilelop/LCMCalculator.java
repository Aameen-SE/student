package jva.whilelop;

import java.util.Scanner;

public class LCMCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1= sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();

        int lcm=(num1>num2)?num1:num2;

        while (true){
            if(lcm%num1==0&&lcm%num2==0){
                System.out.println("Lcm of two given number  num1 : "+num1+" , num2 : "+num2+"  is :"+lcm);
                break;
            }
            lcm++;
        }
        sc.close();
    }
}
