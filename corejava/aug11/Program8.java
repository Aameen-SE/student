package corejava.aug11;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        //Wap to print zero if number zero, 1 if positive and -1 if number is negative
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num==0)
            System.out.println("zero");
        else if (num>0) {
            System.out.println("Positive");
        }
        else
            System.out.println("Negative");
    }
}
