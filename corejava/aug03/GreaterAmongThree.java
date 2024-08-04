package corejava.aug03;

import java.util.Scanner;

public class GreaterAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num :");
        int num1=sc.nextInt();
        System.out.println("Enter the second num :");
        int num2= sc.nextInt();
        System.out.println("Enter the third num :");
        int num3= sc.nextInt();

        if(num1>num2 && num1>num3 )
            System.out.println("Number greater between three is :"+num1);
        else if(num2>num1 && num2>num3)
            System.out.println("Number greater between three is "+num2);
        else
            System.out.println("Number greater between three is "+num3);

    }
}
