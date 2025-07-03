package java8.functionalinterface;

//Create a functional interface StringConverter with a method String convert(String str).
// Implement it using a lambda to convert a string to uppercase and test it.


import java.util.Arrays;

interface StringConverter{
    String convert(String str);
}

public class StringConverterMain {

    public static void main(String[] args) {
        StringConverter input = (e) ->e.toUpperCase() ;
       String convertString = input.convert("aameen hussain");
        System.out.println(convertString);
    }
}
