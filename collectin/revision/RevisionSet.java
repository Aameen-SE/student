package collectin.revision;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RevisionSet {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(12345);
        num.add(1234);
        num.add(123);
        num.add(12);
        num.add(1);
        System.out.println(num);

        Set<Integer> num1 = new LinkedHashSet<>();
        num1.add(12345);
        num1.add(1234);
        num1.add(123);
        num1.add(12);
        num1.add(1);
        System.out.println(num1);

        Set<Integer> numTree = new TreeSet<>(num1);
        System.out.println(numTree);
    }
}
