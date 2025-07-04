package java8.optional;

//Write a method that takes a List<String>, finds the first string that starts with "A" using
// stream().filter(), and returns it as an Optional<String>.
//Test it when there is a string starting with "A" and when there isn’t.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Prog1 {

    public static void main(String[] args) {

        List<String> word = Arrays.asList("Mango","Kiwi","Grapes","Aameen");
        List<String> word1 = Arrays.asList("Mango","Kiwi","Grapes");


        Optional<String> result = findFirstElement(word);
        Optional<String> result1= findFirstElement(word1);

        System.out.println("First String starts with A : "+result.orElse("Not Found"));
        System.out.println("First String starts with A : "+result1.orElse("Not Found"));


    }

    public static Optional<String> findFirstElement(List<String> list ){
        return list.stream().
                filter((e)->e.startsWith("A"))
                .findFirst();
    }

}
