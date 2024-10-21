package collection.lst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lst {
    public static void main(String[] args) {
        List<String> words = List.of("Apple" , "Banana" , "Orange");
        System.out.println(words);
        System.out.println("Words in list of words position at 0index : "+words.get(0));
        System.out.println("PineApple is in the List : "+words.contains("PineApple"));
        System.out.println("Orange is in what index : "+words.indexOf("Orange"));
        System.out.println("Words length is  : "+words.size());

        /*Creating mutable List using ArrayList , LinkedList and Vector */
        List<String> wordsArrayList = new ArrayList<String>(words);
        List<String> wordsLinkedList = new LinkedList<String>(words);
        List<String> wordsVector = new Vector<String>(words);

        System.out.println("Mutable list using arraylist :- "+wordsArrayList);
        wordsArrayList.add("Pineapple");
        System.out.println("After adding words into wordsArrayList : "+wordsArrayList);
    }
}
