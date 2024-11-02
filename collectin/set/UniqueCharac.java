package collectin.set;

import java.util.*;

public class UniqueCharac {
    public static void main(String[] args) {
        List<Character>chars= List.of('A','Z','A','B','Z','F');
        System.out.println("List of char : "+chars);
        // unique set : hash , linked and tree

        Set<Character> charHashSet= new HashSet<>(chars);
        System.out.println("Order in HashSet : "+charHashSet);

        Set<Character> characterTreeSet= new TreeSet<>(chars);
        System.out.println("Sorted order  in TreeSet : "+characterTreeSet);

        Set<Character> characterLinkedHashSet= new LinkedHashSet<>(chars);
        System.out.println("Order in LinkedHashSet : "+characterLinkedHashSet);
    }
}
