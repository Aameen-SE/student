package july2026.jul14;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2="listek";

        char[] a= str1.toCharArray();
        char[] b= str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
            System.out.println("is Anagram");
        else
            System.out.println("Not Anagram");
    }
}
