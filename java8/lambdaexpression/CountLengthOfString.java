package java8.lambdaexpression;

//Given a list of strings, use a lambda expression to count how many strings have length greater than 5.


import java.util.Arrays;
import java.util.List;

public class CountLengthOfString {

    public static void main(String[] args) {

        List<String> fruitList = Arrays.asList("apple","banana","kiwi","mango");
        System.out.println("Elements : "+fruitList);

        long count =fruitList.stream().filter((e)->e.length()>5).count();

        System.out.println("Number of element having length greater than 5 is "+count);
    }
}
