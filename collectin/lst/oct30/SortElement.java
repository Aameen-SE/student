package collectin.lst.oct30;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortElement {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,37,4,89,10,99);
        System.out.println("ELement in LIst : "+num);
        List<Integer> numLL = new LinkedList<>(num);
        Collections.sort(numLL);
        System.out.println("After sorting : "+numLL);
    }
}
