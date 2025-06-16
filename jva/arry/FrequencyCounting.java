package jva.arry;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        Map<Integer,Integer> mapArr = new HashMap<>();

        for(int i:arr){
           if(mapArr.containsKey(i)){
               mapArr.put(i,mapArr.get(i)+1);
           }else {
               mapArr.put(i,1);
           }
        }

        for (Map.Entry<Integer, Integer> entry : mapArr.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
    }
}
