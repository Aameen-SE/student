package july2026;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {

        String s1="listen";
        String s2="silent";

        char[] c1 = s1.toCharArray();
        char[] c2= s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2))
            System.out.println("Its a Anagram");
        else
            System.out.println("Its not a Anagram");
    }
}
