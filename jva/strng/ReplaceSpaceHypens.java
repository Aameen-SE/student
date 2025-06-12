package jva.strng;

import java.util.Scanner;

public class ReplaceSpaceHypens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word or sentence ");
        String input = sc.nextLine();

        String modified = input.replace(" ","-");
        System.out.println("Original String : "+input);
        System.out.println("Modified String : "+modified);
    }
}
