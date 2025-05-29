package jva.may29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[]arr ={"cat","dog","buffalo","cow","horse","dog","cat"};

        List<String> arrList = new ArrayList<>(Arrays.asList(arr));

        System.out.println("Array  :"+Arrays.toString(arr));
        System.out.println("ArrayList : "+arrList);

        HashSet<String> checkList = new HashSet<>(arrList);
        System.out.println("After removing duplicate : "+checkList);
    }
}
