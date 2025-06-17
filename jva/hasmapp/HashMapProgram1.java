package jva.hasmapp;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram1 {
    public static void main(String[] args) {
        String[] fruitList = {"apple", "banana","grapes","apple","banana","kiwi","kiwi"};

        Map<String,Integer> fruitMap = new HashMap<>();

        for(String fruit: fruitList){
            fruitMap.put(fruit,fruitMap.getOrDefault(fruit,0)+1);
        }

        for(Map.Entry<String,Integer> entry : fruitMap.entrySet()){
            System.out.println(entry.getKey()+" : " +entry.getValue());
        }
    }
}
