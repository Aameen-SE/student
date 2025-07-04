package java8.methodreference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Sort a list of strings in alphabetical order using a method reference to String::compareToIgnoreCase.
public class SortString {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("mango","apple","banana","kiwi","grapes"));
        System.out.println("Original List : "+words);

        words.sort(String::compareToIgnoreCase);
        System.out.println("Sorted Listed : "+words);
    }
}
