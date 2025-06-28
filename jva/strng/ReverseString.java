package jva.strng;

public class ReverseString {
    public static void main(String[] args) {
        //How to reverse a String?

        String name ="Aameen Hussain";
        String reverse ="";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }

        System.out.println(reverse);
    }
}
