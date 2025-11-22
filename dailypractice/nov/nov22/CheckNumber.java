package dailypractice.nov.nov22;

import java.util.function.Predicate;

public class CheckNumber {
    public static void main(String[] args) {
        //Use Predicate to check if a number is greater than 10.
        int num =5;

        Predicate<Integer> isGreatherThan10 = n -> n>10;

        if(isGreatherThan10.test(num))
            System.out.println("Greater than 10");
        else
            System.out.println("Not Greater than 10");
    }
}
