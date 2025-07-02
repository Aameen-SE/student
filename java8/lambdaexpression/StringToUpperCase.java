package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCase {
    public static void main(String[] args) {
        // Convert all strings in a list to uppercase using a lambda
        List<String> fruitList = Arrays.asList("apple,banana,kiwi,mango");

       List<String> updateList =  fruitList.stream().map(e->e.toUpperCase())
                 .collect(Collectors.toList());
        System.out.println(updateList);
    }
}
