package collectin.lst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegerList {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,2,5,7,94,3,6);
        System.out.println("List of Integer :"+num);
        List<Integer> numAl= new ArrayList<>(num);

        Collections.sort(numAl);
        System.out.println("After sorting the list :"+numAl);
    }
}
