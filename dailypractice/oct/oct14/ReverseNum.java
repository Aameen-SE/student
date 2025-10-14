package dailypractice.oct.oct14;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed : ");
        int num= sc.nextInt();

        int reverse =0;

        for(;num>0;num=num/10){

            int digit = num%10;
            reverse=reverse*10+digit;
        }
        System.out.println("Reverse number of the given number is "+reverse);

    }
}
