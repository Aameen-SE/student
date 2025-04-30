package QuestionLeetCode;

import java.util.Scanner;

public class Day01PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked whether it is Palindrome or not :");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Palindrome Number :"+false );
        }

        int x=num;

        int revNum=0;

        while(x>0){
            int d= x%10;
            revNum=revNum*10+d;
            x=x/10;
        }
        if(revNum==num){
            System.out.println("Palindrome Number "+true);
        }
        else
            System.out.println("Palindrome Number :"+false);

        }

    }

