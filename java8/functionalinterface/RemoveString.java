package java8.functionalinterface;
//Write a program that takes a list of strings
// and removes all strings that match a condition using Predicate.
// (e.g., remove strings that start with "A").

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RemoveString {

    public static void main(String[] args) {

        List<String> listOfString = new ArrayList<>(Arrays.asList("Aameen","Khan","Apple","Banana","Mango","Armstrong"));
        Predicate<String> isStartWithA = n -> n.startsWith("A");

        listOfString.removeIf(isStartWithA);
        System.out.println(listOfString);

    }



}
