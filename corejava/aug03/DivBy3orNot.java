package corejava.aug03;

import java.util.Scanner;

public class DivBy3orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        if(num%3==0)
            System.out.println("num :"+num+" , Yes it is divisible by 3");
        else
            System.out.println("num :"+num+" , No it is not divisible by 3");
    }
}
