package corejava.methd;

import java.util.Scanner;

public class EvenLengthPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Word : ");
        String word =sc.nextLine();

        printWord(word);

    }
    public static void printWord(String w){
        for(String words : w.split(" ")){
            if(words.length()%2==0)
            {
                System.out.println(words);
            }
        }
    }
}
