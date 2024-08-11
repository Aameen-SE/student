package corejava.aug11;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        //Wap to print odd if number is odd and even if number is even
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();

        if(num%2!=0)
            System.out.println("Odd");
        else
            System.out.println("Even");
    }
}
