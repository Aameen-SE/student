package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;

//Create a list of integers and use a lambda expression to square each number and print it.
public class SquareEachElement {


    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(12,13,14,15,16);
        System.out.println("Integer in List : "+number);

        System.out.println("Square of each element");
        number.stream().forEach((e)-> System.out.print(e*e+" , "));
    }
}
