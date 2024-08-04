package corejava.aug03;

import java.util.Scanner;

public class PrintNum {
    public static void main(String[] args) {
        //Wap to print zero if number zero, 1 if positive and -1 if number is negative
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num= sc.nextInt();;

        if(num==0)
            System.out.println("0");
        else if (num>0) {
            System.out.println("1");
        }
        else if(num<0)
            System.out.println("Negative");
        else
            System.out.println("Its not a number ");

    }
}
