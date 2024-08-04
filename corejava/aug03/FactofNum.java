package corejava.aug03;

import java.util.Scanner;

public class FactofNum {
    public static void main(String[] args) {
        //wap to find factorial of a given number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial :");
        int num = sc.nextInt();

        int res=1;
        for(int i=2;i<=num;i++)
        {
            res=res*i;

        }
        System.out.println("Factorial of a num :"+res);


    }
}
