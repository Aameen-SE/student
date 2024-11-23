package collectin.map;

import java.util.HashMap;
import java.util.Map;

public class First {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",4,"C",6,"D",4);
        System.out.println(map);
       System.out.println("In Map A: "+map.get("A"));
        System.out.println("In Map B:"+map.get("B"));
        System.out.println("Size of map :"+map.size());
        System.out.println("Map contains G: "+map.containsKey("G"));
        System.out.println("Map keys : "+map.keySet());
        System.out.println("Map values : "+map.values());

        // Mutable

        Map<String,Integer> hashmap = new HashMap<>(map);
        hashmap.put("B",5);
        hashmap.put("C",7);
        System.out.println("\nHashmap : "+hashmap );

    }
}
