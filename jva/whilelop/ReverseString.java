package jva.whilelop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //Reverse a string using while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input : ");
        String input = sc.nextLine();
        String reverse="";
        int i=input.length()-1;
        while(i>=0){
            reverse=reverse+input.charAt(i);
            i--;
        }
        System.out.println(reverse);
    }
}
