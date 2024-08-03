package corejava.aug03;

import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        //wap to find a number is negative or positive or zero

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num>0)
            System.out.println("Positive number ");
        else if(num<0)
            System.out.println("Negative number ");
        else
            System.out.println("Number is equal to zero");
    }
}
