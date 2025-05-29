package jva.may29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAlpha {
    public static void main(String[] args) {
        //Sort a List<String> alphabetically
        List<String> alpha =new ArrayList<>(Arrays.asList("a","c","z","d","s","g","e","f"));
         Collections.sort(alpha);
        System.out.println("Alphabets : "+alpha);
    }
}
