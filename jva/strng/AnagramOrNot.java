package jva.strng;

import java.util.Arrays;

public class AnagramOrNot {
    public static void main(String[] args) {
        String input1 = "Silent";
        String input2 ="Listen";
        isAnagram(input1,input2);

    }
    public static void isAnagram(String i1, String i2){
        i1=i1.replace(" ","").toLowerCase();
        i2=i2.replace(" ","").toLowerCase();

        if(i1.length()!=i2.length()){
            System.out.println("Are not anagram");
        }else {
        char []char1 = i1.toCharArray();
        char[] char2 =i2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if(Arrays.equals(char1,char2)){
            System.out.println("is Anagram");
        }else
            System.out.println("Not anagram");
        }
    }
}
