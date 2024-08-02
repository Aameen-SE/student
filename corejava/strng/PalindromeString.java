package corejava.strng;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Words to check for Palindrome");
        String words=sc.nextLine();
        words=words.toLowerCase();

        boolean A= isPalindrome(words);
        System.out.println(A);
    }

    public static boolean isPalindrome(String str){
        String rev="";
        boolean ans=false;
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            ans=true;
        }
        return ans;
    }
}
