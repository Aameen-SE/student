package dailypractice.july13;
//Write a Java method that takes a String as input and returns an array of integers.
//The string will contain words separated by spaces.
//
//For each word, count the number of vowels (a, e, i, o, u) in it.
//
//Store these counts in an integer array, where each element corresponds to a word in the string.

import java.util.Arrays;
import java.util.Scanner;

public class CountVowelsInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentences : ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        int[] vowelsCount = new int[words.length];

        for(int i = 0;i< words.length;i++){
            int count =0;

            String word = words[i];

            for(int j=0;j<word.length();j++){
                char ch = Character.toLowerCase(word.charAt(j));

                if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'){
                    count++;
                }
            }
            vowelsCount[i]=count;
        }

        System.out.println(Arrays.toString(vowelsCount));
    }
}
