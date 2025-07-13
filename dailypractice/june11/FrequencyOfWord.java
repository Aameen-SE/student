package dailypractice.june11;
//Write a Java program that takes a sentence as input and prints the frequency of each word using a HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentences :");

        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");

        Map<String ,Integer> wordMap = new HashMap<>();

        for (String word : words){
            if(wordMap.containsKey(word)){
                wordMap.put(word,wordMap.get(word)+1);
            }
            else {
                wordMap.put(word,1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
