package corejava.aug03;

import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        //wap to find a number is odd or even

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        if(num%2==0)
            System.out.println("Given number is even number  ");
        else
            System.out.println("Given number is odd number ");
    }
}
