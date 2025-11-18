package dailypractice.nov.nov18;

import java.util.Scanner;

public class RevrseNum {
    public static void main(String[] args) {

        //	43.	wap to reverse a number e.g ip=12345, op=54321 avoid zero

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num = scanner.nextInt();

       int rev = reverseNum(num);
        System.out.println("Reverse of the given number is :"+rev);
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
