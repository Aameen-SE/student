package dailypractice.nov.nov20;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        //Reverse a string without using StringBuilder.reverse()

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String ?");
        String input = sc.nextLine();

        reverse(input);
        reverseString(input);
    }

    public static void reverse(String str) {

        String rev = "";

        for(int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println("Reverse of the given String is :"+rev);
    }
    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println("Reverse of the given String is :"+sb.toString());
    }
}
