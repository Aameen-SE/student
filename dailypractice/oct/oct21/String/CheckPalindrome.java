package dailypractice.oct.oct21.String;

public class CheckPalindrome {
    public static void main(String[] args) {

        String str = "Madam";

       String l = str.toLowerCase();
        String reverse = "";

        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+l.charAt(i);
        }

        if(reverse.equals(l))
            System.out.println("String Is Palindrome : "+str);
        else
            System.out.println("String is not a palindrome :"+str);
    }
}
