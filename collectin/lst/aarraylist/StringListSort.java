package collectin.lst.aarraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringListSort {
    //Create an ArrayList of strings and sort it in alphabetical order without using streams.
    public static void main(String[] args) {
        List<String> fruitList = Arrays.asList("Apple","Banana","Kiwi","Grapes","Mango");

        ArrayList<String> alphabets = new ArrayList<>(fruitList);

        Collections.sort(alphabets);

        System.out.println(alphabets);


    }
}
