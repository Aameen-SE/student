package corejava.aug03;

import java.util.Scanner;

public class CountNumDigit {
    public static void main(String[] args) {
        //Wap to count number of digits in a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int count=0;
        for(;num!=0;num=num/10)
        {
            count=count+1;
        }
        System.out.println("count of digit :"+count);
    }
}
