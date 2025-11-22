package dailypractice.nov.nov22;

import java.util.Arrays;
import java.util.List;

public class UpperCaseString {
    public static void main(String[] args) {

        //Convert a list of strings into uppercase using map()
        List<String> words = Arrays.asList("aameen","khan","hussain");
        words.stream()
                .map(e->e.toUpperCase()).forEach(System.out::println);
    }
}
