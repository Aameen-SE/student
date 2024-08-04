package corejava.aug03;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Wap to print multiplication table of any number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to see its multiplication table :");
        int num=sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * " +i+ " = "+(num*i));
        }
    }
}
