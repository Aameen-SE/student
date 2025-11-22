package dailypractice.nov.nov22;

import java.util.Arrays;
import java.util.List;

//From a list of strings, find the first string that starts with "A" using Streams.
public class FindFirstString {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("mango","Apple","Banana","Kiwi","Anar");
        fruits.stream().filter(e->e.startsWith("A"))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
