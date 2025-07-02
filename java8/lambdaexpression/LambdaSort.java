package java8.lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        //Sort a list of strings in alphabetical order using a lambda expression
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Grapes");

        Collections.sort(fruits,(s1,s2)->s1.compareTo(s2));

        System.out.println(fruits);
    }
}
