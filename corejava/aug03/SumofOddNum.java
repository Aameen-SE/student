package corejava.aug03;

import java.util.Scanner;

public class SumofOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till to be printed :");
        int num=sc.nextInt();
        int sum=0;

        for(int i=1;i<=num;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of all the odd number from 1 to n : "+num+" is : "+sum);
    }
}
