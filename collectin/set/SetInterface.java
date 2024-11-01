package collectin.set;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> word = Set.of("Apple","Banana","Cat");
        System.out.println(word);       // It does not care about position order

        Set<String> wordHash = new HashSet<>(word);
        wordHash.add("Apple");          // It does not add duplicate element
        System.out.println(wordHash);
    }
}
