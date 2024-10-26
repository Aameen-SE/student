package collectin.lst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LstProb1 {
    public static void main(String[] args) {
        List<String> list1 = List.of("Apple","Mango");
        System.out.println("List 1 : "+list1);
        List<String> list2 = List.of("Banana","Orange");
        System.out.println("List 2 : "+list2);
        List<String> list3 = List.of("PineApple","Grapes");
        System.out.println("List 3 : "+list3);

        List<String> mergeArrayList = new ArrayList<>(list1);
        mergeArrayList.addAll(list2);
        mergeArrayList.addAll(list3);
        System.out.println("Merge all the list using arrayList : "+mergeArrayList);

        // iteration around the element
        System.out.print("Using for loop for iteration :");
        for(int i =0;i<mergeArrayList.size();i++){
            System.out.print(mergeArrayList.get(i)+" , ");
        }
        System.out.print("\nUsing for enhanced loop for iteration : ");
        for(String list : mergeArrayList){
            System.out.print(list+" ;");
        }

        System.out.print("\n Using Iterator to iterate : ");

        Iterator<String> wordIterator = mergeArrayList.iterator();
        while (wordIterator.hasNext()){
            System.out.print(wordIterator.next()+" , ");
        }
        System.out.println();
        // Iteration approach
        // printing the word that ends with "at"

        List<String> newWordList = List.of("Bat","Cat","Ball","Chat");
        List<String> newWordAL = new ArrayList<>(newWordList);

        for(String newWord:newWordAL){
            if(newWord.endsWith("at")){
                System.out.println(newWord);
            }
        }
    }
}
