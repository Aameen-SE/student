package jva.may29;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetUnionIntersection {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("set1 : "+set1);
        System.out.println("set2 : "+set2);

        System.out.println("Union : "+union);
        System.out.println("Intersection : "+intersection);
    }
}
