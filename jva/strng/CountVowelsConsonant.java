package jva.strng;

import java.util.Scanner;

public class CountVowelsConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string ");
        String input = scanner.nextLine().toLowerCase();
        input.replace("/s","");
        int countVowel =0;
        int countConsonant=0;

        for(int i=0;i<input.length();i++){
            char c= input.charAt(i);
            if(Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    countVowel++;
                } else {
                    countConsonant++;
                }
            }
        }

        System.out.println("No of vowels in input : "+countVowel);
        System.out.println("No of consonant in input : "+countConsonant);
    }
    }

