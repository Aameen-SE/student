package dailypractice.dec08;

import java.util.Scanner;

public class FactOfNum {
    public static void main(String[] args) {
        //	40.	wap to find factorial of a given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num =sc.nextInt();

        fact(num);
    }
    public static void fact(int num){
        int fact=1;
        while(num>0){
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial of the given number is :"+fact);
    }
}
