package dailypractice.dec08.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {

    public static void main(String[] args) {
        //Convert each string to uppercase

        List<String> words = Arrays.asList("aameen","words","apple","mango");
        List<String> upperCaseWords= words.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseWords);
    }
}
