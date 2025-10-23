package dailypractice.oct.oct21.String;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 ="Silent";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()!=str2.length()){
            System.out.println("Not Anagram ");
        }else {

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

             Arrays.sort(arr1);
             Arrays.sort(arr2);

            if (Arrays.equals(arr1,arr2)){
                System.out.println("Is Anagram ");
            }
            else
                System.out.println("Not An Anagram");
        }
    }
}
