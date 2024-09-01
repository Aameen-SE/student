package corejava.aug29;

import java.util.Scanner;

public class MathProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find out the factorial :");
        int num=sc.nextInt();
        printFactorial(num);
        checkPrime(num);
    }
    //wap to find factorial of a given number
    public static void printFactorial(int num){
        int fact=1;
        for(int i=num;i>1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of given number :"+fact);
    }


    public static void checkPrime(int num){
        if(num==1&&num==2&&num==3){
            System.out.println("Given Number is Prime Number ");
        } else if (num%2!=0&&num%3!=0) {
            System.out.println("Given Number is  Prime Number ");
        }
        else
            System.out.println("Not a Prime Number ");
    }



}
