package collectin.map;

import java.util.*;

public class CountFrequencyString {

    public static void main(String[] args) {

        List<String> fruit = new ArrayList<>(Arrays.asList("apple" , "banana", "apple", "orange" ,"banana" ,"apple"));

        Map<String ,Integer> fruitMap = new HashMap<>();

        for(String f:fruit){
            fruitMap.put(f,fruitMap.getOrDefault(f,0)+1);
        }

        for(Map.Entry<String,Integer> mapF : fruitMap.entrySet()){
            System.out.println(mapF.getKey()+" = "+ mapF.getValue());
        }
    }
}
