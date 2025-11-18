package dailypractice.nov.nov18;

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num = sc.nextInt();
        palindrome(num);
    }
    public static void palindrome(int num){
        int temp = num;
        int rev = reverseNum(temp);
        if(num==rev)
            System.out.println("Give Num : " + num +" is Palindrome Number ");
        else
            System.out.println("Give Num : " + num +" is Not Palindrome Number ");

    }

    public static int reverseNum(int num){
        int rev =0;
        for(;num>0;num=num/10){
            int digit = num%10;
            rev = rev*10 + digit;
        }
        return  rev;
    }
}
