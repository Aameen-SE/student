package corejava.aug06;

import java.util.Scanner;

public class PerfectNuminRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num =sc.nextInt();
        int sum=0;

        System.out.println("Perfect Number is the sum of  factor of num is equal to original number ");

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            System.out.println("Perfect Number as its sum is :"+sum);
        }
        else
            System.out.println("Not a perfect Number as its sum is :"+sum);

    }
}
