package dailypractice.oct.oct21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {25, 11, 7, 75, 56, 11, 25, 25};

        Map<Integer,Integer> freqCount = new HashMap<>();

        for(int i:arr){
            freqCount.put(i,freqCount.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: freqCount.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
