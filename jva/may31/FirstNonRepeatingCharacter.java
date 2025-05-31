package jva.may31;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String input ="aabbccdeef";
        System.out.println(input);
        char result=findFirstNonRepeat(input);

        if(result=='-')
            System.out.println("No non-repeating character");
        else
            System.out.println("NonRepeating character : "+result);

    }
    public static char findFirstNonRepeat(String inp){

        Map<Character,Integer> count = new LinkedHashMap<>(); // to keep it in order

        for(char c:inp.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry: count.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '-';
    }
}
