package collectin.lst;

import java.util.*;

// previous day revision :
public class PreviousRevision {
    public static void main(String[] args) {
        List<String> word = List.of("Apple","Ball","Call","Doll");
        System.out.println("Word List is created : "+word);
        // as it is immutable so to make it mutable we use arraylist , linkedlist and vector

        List<String> wordArrayList = new ArrayList<>(word);
        List<String> wordLinkedList = new LinkedList<>(word);
        List<String> wordVector = new Vector<>(word);
        // adding a element in list
        wordArrayList.add("Mall");
        System.out.println("Adding a new variable and printing it : "+wordArrayList);
        // creating new list
        List<String> list2 = List.of("Fall","Fell");
        System.out.println("New List : "+list2);
       // List<String> list2Arr = new ArrayList<>(list2);
        // adding new list
        wordArrayList.addAll(list2);
        System.out.println("adding another list into the previous list :"+wordArrayList);

        // Iteration
        System.out.println("\nIterating around the element using for loop: ");
        for(int i =0;i<wordArrayList.size();i++){
            System.out.print(wordArrayList.get(i)+" ,");
        }

        // using for each loop
        System.out.println("\nIteration using for each loop :");
        for(String w:wordArrayList){
            System.out.print(w+" ;");
        }

        // using iterator
        System.out.println("\nIteration using iterator : ");
        Iterator<String> wordIter = wordArrayList.iterator();
        while (wordIter.hasNext()){
            System.out.print(wordIter.next()+" ,");
        }

        // using iterator to find out the word having "ll"
        System.out.println("\nFinding the word which eds with 'll' : ");
        for (String wo:wordArrayList){
            if (wo.endsWith("ll")){
                System.out.print(wo+" ;");
            }
        }
    }
}
