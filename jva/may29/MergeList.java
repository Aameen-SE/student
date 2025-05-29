package jva.may29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {
        List<String> fruits1 = new ArrayList<>( Arrays.asList("apple","banana","grapes"));
        List<String> fruits2 = new ArrayList<>(Arrays.asList("kiwi","watermelon","mango"));

        fruits1.addAll(fruits2);
        System.out.println("MergeList : "+fruits1);
    }
}
