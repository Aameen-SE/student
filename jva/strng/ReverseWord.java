package jva.strng;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();
        String reverse = " ";
        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);
        }

        System.out.println("Reverese of the given word : "+reverse);
    }
}
