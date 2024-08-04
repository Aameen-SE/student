package corejava.aug03;

import java.util.Scanner;

public class FindFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();

    }
    public static void firstDigit(int num){
        for(;num>=10;num=num/10) {
        }
        System.out.println("first digit :"+num);

        while(num>=10){
            num=num/10;
        }
        System.out.println("First Digit"+num);

    }
    public static void lastDigit(int num)
    {
        num = num%10;
        System.out.println("Last Digit :"+num);
    }

}
