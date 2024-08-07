package corejava.aug06;

public class PalindromeorNot {
    public static void main(String[] args) {
        int num =121;
        int n=num;
        int rev=0;
        for(;num>=1;num=num/10)
        {
            int ld=num%10;
            rev=rev*10+ld;
        }
        if(n==rev)
            System.out.println("Palindrome");
        else
            System.out.println("not Palindrome");
    }

}
