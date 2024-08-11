package corejava.aug11;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        //Wap to check whether number is less than 100 or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();

        if(num<100)
            System.out.println("Number is less than 100");
        else
            System.out.println("Numnber is not less than 100");
    }
}
