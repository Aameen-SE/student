package dailypractice.july09;

import java.util.*;

public class CountFrequencyOfString {

    public static void main(String[] args) {

        List<String> nameList = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "John", "Alice", "David", "Eve", "Bob", "Alice"));

        Map<String,Integer> mapList = new HashMap<>();

        for(String name : nameList){
            mapList.put(name,mapList.getOrDefault(name,0)+1);
        }

        for(Map.Entry<String,Integer> map : mapList.entrySet()){
            System.out.println(map.getKey()+" = "+map.getValue());
        }

    }
}
