package corejava.strng;

import java.util.Scanner;

public class EvenLengthWord {
    public static void main(String[] args) {
        //Java program to print Even length words in a String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word");
        String w =sc.nextLine();

        for(String word:w.split(" ")){

            if(word.length()%2==0)
            {
                System.out.println(word);
            }
        }
    }

}
