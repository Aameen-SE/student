package collectin;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        Vector<Integer> vec1 = new Vector<>(l1);
        System.out.println(vec1);
        Vector<Integer> vec = new Vector<>(5,3);
        System.out.println(vec.capacity());
        vec.add(1);
        vec.add(1);
        vec.add(1);
        vec.add(1);
        vec.add(1);
        vec.add(1);
        System.out.println(vec.capacity());


    }
}
