package collectin.lst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationApproachList {
    public static void main(String[] args) {
        List<String> words = List.of("Apple","Cat" , "Bat");

        List<String> wordAl = new ArrayList<>(words);

        // printing the words that ends with at
        for(String word:words){
        if(word.endsWith("at")){
            System.out.println(word);
        }
        }

        // deleteing the words that ends with "at" using iterator
        Iterator<String> iterator= wordAl.iterator();
        while (iterator.hasNext()){
            if(iterator.next().endsWith("at")){
                iterator.remove();
            }
        }
        for(String w:wordAl){
            System.out.println(w);
        }


    }
}
