package jva.strng;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        //WAP program to reverse word based on space
        //		a.	IP -   Hello world how are you
        //			OP -   you are how world Hello
       String input ="Hello world how are you";

       String[] words = input.split(" ");
       StringBuilder reverse = new StringBuilder();
       for(int i=words.length-1;i>=0;i--){
           reverse.append(words[i]).append(" ");
       }

       String result = reverse.toString().trim();
        System.out.println(result);
    }
}
