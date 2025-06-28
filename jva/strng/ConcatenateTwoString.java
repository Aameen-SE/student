package jva.strng;

public class ConcatenateTwoString {
    public static void main(String[] args) {
        String firstName ="Aameen";
        String lastName="Hussain";

        String concat =firstName.concat(lastName);

        String result = firstName+" " +lastName;

        System.out.println(result);

        System.out.println(concat);
    }
}
