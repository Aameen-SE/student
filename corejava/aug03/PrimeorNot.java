package corejava.aug03;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        //wap to find given number is prime or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that will be checked to see it is Prime or not :");
        int num = sc.nextInt();

        if(num==1)
            System.out.println("Prime Number ");
        else if (num%2==0||num%3==0) {
            System.out.println("Not Prime Number ");
        }
        else
            System.out.println("Prime Number ");
    }
}
