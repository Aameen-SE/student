package collectin.lst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lst {
    public static void main(String[] args) {
        List<String>  word = List.of("Apple" , "Banane" , "Orange"); // as using of OF makes its immutable
        System.out.println(word);

        // so to convert into mutable we gonna use vector, linkedlist and Arraylist
        List<String> wordList = new ArrayList<String>(word);
        System.out.println("Mutable using ArrayList : "+wordList.get(0));

        List<String> wordLList = new LinkedList<String>(word);
        System.out.println("Mutable using LinkedList : "+wordLList.get(1));

        List<String> wordVector = new Vector<String>(word);
        System.out.println("Mutable using Vector : "+wordLList.get(2));

        System.out.println("Words contain Pineapple : "+word.contains("Pineapple"));
        System.out.println("Length :"+word.size());

        wordLList.add("Grapes");
        System.out.println("Adding new words grapes in list : "+wordLList);

        // adding at a specific position :
        wordList.add(1,"BlueBerry");
        System.out.println("Adding words at index position 1 :"+wordList);

        // adding a new list in to a previous list using array list

        List<String> newList = List.of("Yak" ,"Gone");
        wordList.addAll(newList);
        System.out.println("Adding a new list into WordList :  "+wordList);
        wordList.set(5,"Zebra");
        System.out.println("Replacing the word at 5th index to Zebra : "+wordList);

        // deleting an element

        wordList.remove("Yak");
        System.out.println("After deleting Yak : "+wordList);
        wordList.remove(2);
        System.out.println("Deleting element using indexposition 2   : "+wordList);
    }
}
