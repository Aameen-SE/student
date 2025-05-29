package jva.may29;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","grapes","kiwi","apple","kiwi","mango","grapes"));

        Set<String> uniqueFruit = new HashSet<>(fruits);

        for(String fruit:uniqueFruit){
            int frq= Collections.frequency(fruits,fruit);
            System.out.println(fruit+ "-----> "+frq);
        }
    }
}
