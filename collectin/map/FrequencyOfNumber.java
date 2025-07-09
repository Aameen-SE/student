package collectin.map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumber {

    public static void main(String[] args) {
        //Given an array of integers, count the frequency of each number and store it in a Map<Integer, Integer>.
        //
        //Example: [1, 2, 2, 3, 1, 2] → {1=2, 2=3, 3=1}.

        int[] arr = {1, 2, 2, 3, 1, 2};

        Map<Integer,Integer> numberMap = new HashMap<>();

        for(int a:arr){
            numberMap.put(a,numberMap.getOrDefault(a,0)+1);
        }

        for(Map.Entry<Integer,Integer> m : numberMap.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
