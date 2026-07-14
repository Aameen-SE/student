package july2026.jul14;

public class Palindrome {
    public static void main(String[] args) {
        String str ="madak";
        palindrome(str);
    }

    public static void palindrome(String str){
        String rev ="";

        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if (str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
