package java8.methodreference;

//Create a list of strings and use a method reference to System.out::println to print each string.

import java.util.Arrays;
import java.util.List;

public class PrintListOfString {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple","banana","kiwi","mango");

        words.forEach(System.out::println);
    }
}
