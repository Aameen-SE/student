package jva.hasmapp;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<String , Integer> map = new HashMap<>();

        map.put("apple",1);
        int qty = map.get("apple");
        System.out.println("Quatity of apple : "+qty);

        map.containsKey("banana");

        map.remove("aaple");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
