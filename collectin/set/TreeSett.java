package collectin.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSett {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>(Set.of(12,23,45,67,21,68,11));
        System.out.println(num);
        // to find out the loweer in the list using navigable set interface
        System.out.println("Number lower than 20 : "+num.floor(20));
        System.out.println(num.lower(12));
        System.out.println(num.ceiling(67));
        System.out.println(num.higher(21));
        System.out.println(num.subSet(21,30));
        System.out.println(num.subSet(21,true,68,true));
        System.out.println(num.headSet(21));
        System.out.println(num.tailSet(21));
    }
}
