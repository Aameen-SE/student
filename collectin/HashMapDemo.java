package collectin;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Aameen");
        map.put(2,"Khan");
        map.put(3,"Hussain");
        System.out.println(map);
        // iterate
        for (int i:map.keySet()){
            System.out.println(map.get(i));
        }

      


    }
}
