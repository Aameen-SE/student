package july2026.jul14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountCharFrequency {
    public static void main(String[] args) {
        String str = "AameenHussain";

        count(str);
    }

    public static void count(String str){

        Map<Character,Integer> map = new HashMap<>();
        for (char c:str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
