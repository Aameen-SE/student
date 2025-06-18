package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String input = sc.nextLine();

        System.out.println("Is Valid string : "+isValid(input));

    }
    public static boolean isValid(String inp){
        Stack<Character> stack= new Stack<>();
        for(char ch : inp.toCharArray()){
        if(ch=='{'||ch=='['||ch=='('){
            stack.push(ch);
        }else {
            if(stack.isEmpty()) return false;

            char top=stack.pop();
            if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!=']')){
                return false;
            }
        }
        }
        return stack.isEmpty();
    }
}
