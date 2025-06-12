package jva.strng;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string ");
        String word = sc.nextLine();
        word=word.toLowerCase();

        String  reverse ="";

        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }

        if(word.equals(reverse))
            System.out.println("It is a palindrome");
        else
            System.out.println("Not a palindrome ");
    }
}
