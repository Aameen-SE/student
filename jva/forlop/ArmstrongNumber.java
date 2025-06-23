package jva.forlop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int count= count(num);

        boolean result= checkArmstring(num,count);
        if(result)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number ");

    }
    public static int count(int num ){
        int count=0;
        for(;num!=0;num=num/10){
            count++;
        }
        return count ;
    }

    public static boolean checkArmstring(int num , int count){
        int originalNum= num;
        int sum=0;
        for(;num!=0;num=num/10){
            int digit=num%10;
            int multi=1;
            for(int i=1;i<=count;i++){
                multi=multi*digit;
            }
            sum=sum+multi;
        }
        System.out.println(sum);

        if(originalNum==sum)
            return true;
        return false;
    }
}
