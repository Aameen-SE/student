package java8.lambdaexpression;
// Write a program using a lambda to check if a given string is a palindrome (same forward and backward).
// Test it on multiple strings.



@FunctionalInterface
interface StringChecker{
    boolean check(String s);
}
public class CheckPalindrome {

    public static void main(String[] args) {

    StringChecker isPalindrome = (str)-> {
        String reverseString = new StringBuilder(str).reverse().toString();
    return str.equalsIgnoreCase(reverseString);
    };

    String[] input ={"apple","kiki","mango","racecar","madam"};

    for (String s:input){
        if (isPalindrome.check(s)){
            System.out.println(s+" is Palindrome ");
        }else
            System.out.println(s+" is not a Palindrome ");
    }

    }
}
