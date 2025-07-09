package collectin.map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyString {

    public static void main(String[] args) {
        //
        String str = "apple banana apple orange banana apple";
        String[] word = str.split(" ");

        Map<String ,Integer> strMap = new HashMap<>();

        for(String s:word){
            strMap.put(s,strMap.getOrDefault(s,0)+1);
        }

        for(Map.Entry<String,Integer> m: strMap.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }

    }
}
