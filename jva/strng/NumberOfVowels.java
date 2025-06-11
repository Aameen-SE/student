package jva.strng;

import java.util.Scanner;

public class NumberOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentences : ");
        String word = sc.nextLine();
       word= word.toLowerCase();
        int count =0;

        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }

        System.out.println("Number of vowels in string : "+count);

    }
}
