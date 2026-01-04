package practice2026.forloop;

import java.util.Scanner;

public class PalindromeOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        checkPalindrome(num);
    }

    public static void checkPalindrome(int num) {
        if (num == reverse(num)) {
            System.out.println("Palindrome Number ");
        } else
            System.out.println("Not a Palindrome Number");
    }


    public static int reverse(int num) {
        int reverse = 0;
        for (int i = num; i > 0; i = i / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println(reverse);
        return reverse;
    }
}
