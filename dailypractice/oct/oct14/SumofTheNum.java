package dailypractice.oct.oct14;

import java.util.Scanner;

public class SumofTheNum {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be sum");
        int num = sc.nextInt();
        int sum =0;
        for(;num>0;num=num/10){
            int digit = num%10;
            sum=sum+digit;
        }

        System.out.println("Sum of the given number is : "+sum);
    }
}
