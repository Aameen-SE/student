package dailypractice.july31;

import java.util.Scanner;

public class StringisPalindromeOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();

        input = input.toLowerCase();

        String reverse = "";
        for(int i=input.length()-1;i>=0;i--){
            reverse= reverse+ input.charAt(i);
        }

        if(input.equals(reverse)){
            System.out.println("Given String is Palindrome ");
        }
        else
            System.out.println("Given String is not a Palindrome");

    }
}
