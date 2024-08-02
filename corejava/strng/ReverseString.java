package corejava.strng;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str=sc.nextLine();

        String revr="";
        char ch;


        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            revr=ch+revr;
        }
        System.out.println("Reversed String :"+revr);


    }
}
