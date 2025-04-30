package collectin;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        // LIFO = LAST IN FIRST OUT
        Stack<Integer> sta = new Stack<>();
        sta.push(1);
        sta.push(2);
        sta.push(3);
        sta.push(4);
        sta.push(5);
        System.out.println(sta);

        System.out.println(sta.pop());
        System.out.println(sta);
        // checking whats at the top without removing
        System.out.println(sta.peek());
        System.out.println(sta);


    }
}
