package jva.strng;

public class SearchWordInString {
    public static void main(String[] args) {
        //How to search a word inside a string?
        String word = "How is it Going. Will it work";
        boolean result =word.contains("work");
        System.out.println("Does the string contains 'word ' : "+result);
    }
}
