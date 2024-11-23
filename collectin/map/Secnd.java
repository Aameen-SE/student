package collectin.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Secnd {
    public static void main(String[] args) {

        // neither sorted nor insertion way
        HashMap<String,Integer> hmap = new HashMap<>();
        hmap.put("A",3);
        hmap.put("C",9);
        hmap.put("B",7);
        System.out.println("Hashmap : "+hmap);
        // sorted in insertion way
        LinkedHashMap<String,Integer> lhmap = new LinkedHashMap<>();
        lhmap.put("A",3);
        lhmap.put("C",9);
        lhmap.put("B",7);
        System.out.println("LinkedHashmap : "+lhmap);
        // sorted order
        TreeMap<String,Integer> tmap = new TreeMap<>();
        tmap.put("A",3);
        tmap.put("C",9);
        tmap.put("B",7);
        System.out.println("TreeMap  : "+tmap);
    }
}
