package dailypractice.oct.oct20;
//⚡ Question 2: Word Frequency Counter
//
//Problem:
//You are given a paragraph (a long string).
//You need to count how many times each word appears and display the result.
//
//Requirements:
//
//Take a string input (e.g. "Java is great and Java is powerful").
//
//Split the string into individual words.
//
//Use a Map<String, Integer> (like HashMap) to count the frequency of each word.
//
//Print each word along with its frequency.
//
//Print the word that has the highest frequency.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String str = "Java is great and Java is powerful";

        String[] word = str.split(" ");
        Map<String,Integer> mapStr = new HashMap<>();

        for(String w :word){
            w.toLowerCase();

            if(mapStr.containsKey(w)){
                mapStr.put(w,mapStr.get(w)+1);
            }else {
                mapStr.put(w,1);
            }
        }


        System.out.println("Word Frequencies");

        for(Map.Entry<String,Integer> entry :mapStr.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }



        Map<String,Long> wordCount = Arrays.stream(str.split(" "))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        w ->w,
                        Collectors.counting()
                ));

        wordCount.forEach((w,c)-> System.out.println(w +" : "+c));
    }
}
