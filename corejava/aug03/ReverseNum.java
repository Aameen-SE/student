package corejava.aug03;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        //wap to reverse a number e.g ip=12345, op=54321
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();
        int revr=0;

        for(;num!=0;num=num/10)
        {
            int rem = num%10;
            revr=revr*10+rem;
        }
        System.out.println("The revrese of the given num is "+revr);
    }
}
