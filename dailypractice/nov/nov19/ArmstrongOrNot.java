package dailypractice.nov.nov19;
//Write a method to check if a number is Armstrong or not.

import java.util.Scanner;

public class ArmstrongOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num=sc.nextInt();

        if(isArm(num)){
            System.out.println("Yes the given number : "+num+" is Armstrong number");
        }
        else
            System.out.println("Yes the given number : "+num+" is not Armstrong number");

    }

    public static boolean isArm(int num){

        int n =num;
        int sum=0;

        while (n!=0){
            int digit = n%10;
            sum=sum+digit*digit*digit;
            n=n/10;
        }

        return sum==num;
    }
    public static boolean isArmstrong(int num){
        int originalNum = num;
        int sum =0;
        int countDigit =0;

        int temp =num;

        while (temp!=0){
            temp=temp/10;
            countDigit++;
        }

        temp=num;

        while (temp!=0){
            int digit = temp%10;
            sum+=(int) Math.pow(digit,countDigit);
            temp=temp/10;
        }

        return sum==originalNum;
    }
}
