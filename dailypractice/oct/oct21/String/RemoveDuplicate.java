package dailypractice.oct.oct21.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "Aameen Hussain";

        char[] c = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        for(char ch:c){
            if(ch != ' ') {
                set.add(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        for(char ch:set){
            result.append(ch);
        }

        System.out.println("After removing duplicates :"+result);
    }
}
