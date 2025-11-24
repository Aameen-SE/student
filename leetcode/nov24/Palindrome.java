package leetcode.nov24;

public class Palindrome {

    public static void main(String[] args) {
        int num =123;
        if(isPalindrome(num)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
        public static boolean isPalindrome(int x) {
        int temp=x;
        int rev =0;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        return rev==x;
        }

}
