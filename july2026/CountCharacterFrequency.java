package july2026;

import java.util.HashMap;

public class CountCharacterFrequency {

    public static void main(String[] args) {

       String str ="AameenHussain";

//       HashMap<Character,Integer> map = new HashMap<>();
//
//       for(char c: str.toCharArray()){
//           map.put(c, map.getOrDefault(c,0)+1);
//       }
//        System.out.println(map);

       countCharFreq(str);
    }




    public static void countCharFreq(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
