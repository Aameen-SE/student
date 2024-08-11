package corejava.aug11;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        //Wap to check whether number is between -100 to 50
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();

        if(num<50 && num>-100)
            System.out.println("Yes ,number is between -100 to 50 ");
        else
            System.out.println("No ,number is between -100 to 50");
    }
}
