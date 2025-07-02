package java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEmptyString {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>(Arrays.asList("aaple","","banana","","mango"));

        fruit.removeIf(e->e.isEmpty());

        System.out.println(fruit);
    }
}
