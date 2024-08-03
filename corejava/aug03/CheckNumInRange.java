package corejava.aug03;

import java.util.Scanner;

public class CheckNumInRange {
    public static void main(String[] args) {
        //Wap to check whether number is between -100 to 50
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num =sc.nextInt();

        if(num<50&&num>-100)
            System.out.println(num+"Yes the number is between -100 to 50 ");
        else
            System.out.println(num+" : No the number is not between -100 to 50");
    }
}
