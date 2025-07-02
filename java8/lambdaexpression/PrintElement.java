package java8.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class PrintElement {
    // Print all elements in a list using a lambda expression
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,23,4,56,7,89,110);

       number.forEach((e)->{
           System.out.print(e+" ,");
       });

    }
}
