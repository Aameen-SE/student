package jva.strng;

public class ConvertStringToChar {
    public static void main(String[] args) {
        String input = "hello world";
        char[] c= input.toCharArray();

        for(char ch :c){
            System.out.println(ch);
        }
    }
}
