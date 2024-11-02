package collectin.revision;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRev {
    public static void main(String[] args) {
        List<String> word = List.of("Apple","Mango","Pineapple");
        List<String> wordArr = new ArrayList<>(word);
        wordArr.add("Grapes");
        System.out.println(wordArr);
        List<String> words = List.of("BlueBerry","Orange");
        wordArr.addAll(words);
        System.out.println(wordArr);
        System.out.println("Iteration : ");
        for(int i =0;i<wordArr.size();i++){
            System.out.print(wordArr.get(i)+" ; ");
        }
        System.out.println("Using Iterator ");
        Iterator<String> wordIterate = wordArr.iterator();
        while (wordIterate.hasNext()){
            if (wordIterate.next().endsWith("le")){
               wordIterate.remove();
            }
        }
        System.out.println("After using iterator and remove alphabet eneds with le :");
        for (String w : wordArr){
            System.out.print(w);
        }
    }
}
