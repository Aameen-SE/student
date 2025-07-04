package java8.methodreference;

//Given a list of strings, convert them all to uppercase using
// a method reference to String::toUpperCase in a stream map operation


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(Arrays.asList("apple","banana","kiwi","mango"));
        System.out.println("Original List : "+fruits);
       List<String> upperCase = fruits.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
    }
}
