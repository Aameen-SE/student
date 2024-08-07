package corejava.aug06;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num= sc.nextInt();

        int count=0;

        while(num>=1){
            count=count+1;
            num=num/10;
        }



    }


}
