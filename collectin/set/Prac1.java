package collectin.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prac1 {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        num.add(12345);
        num.add(1234);
        num.add(123);
        num.add(12);
        // set and hashset storing the element in random order
        System.out.println("HashSet num :"+num);

        // lets create with linkedhash set
        Set<Integer> num2 = new LinkedHashSet<>();
        num2.add(74568);
        num2.add(7456);
        num2.add(745);
        num2.add(74);
        // storing the element in a order not randomly
        System.out.println("LinkedHashSet num :"+num2);

        // TreeSet
        Set<Integer> n = new TreeSet<>();
        n.add(12345);
        n.add(1234);
        n.add(123);
        n.add(12);
        n.add(1);
        //Stored the element in a sorted array
        System.out.println("TreeSet  num :"+n);



    }
}
