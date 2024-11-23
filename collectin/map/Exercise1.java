package collectin.map;

import java.util.HashMap;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        // count occurrences of word and characters in string
       String str = "This has never happened .What are we going to do ";

       Map<Character,Integer> occurrence = new HashMap<>();
       char[] characters=str.toCharArray();

       for(char character:characters){
           Integer integer = occurrence.get(character);
           if(integer==null){
               occurrence.put(character,1);
           }else {
               occurrence.put(character,integer+1);
           }
       }

        System.out.println(occurrence);
        System.out.println("\nString printing using map ");
// On String
        String str1 = "This has never happened .This is the interesting part ." +
                " This is the story .  ";

        Map<String,Integer> strOccur = new HashMap<>();
      String[] words =str1.split(" ");
      for(String word:words){
          Integer integer=strOccur.get(word);
          if (integer==null){
              strOccur.put(word,1);
          }else {
              strOccur.put(word,integer+1);
          }
      }
        System.out.println(strOccur);
    }
}
