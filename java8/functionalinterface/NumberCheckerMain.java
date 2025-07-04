package java8.functionalinterface;

//Create a functional interface NumberChecker with a method boolean check(int n).
// Implement it using a lambda to check if a number is even and divisible by 5. Test it on multiple numbers.

import java.util.Arrays;

interface  NumberChecker{
    boolean check(int n);
}

public class NumberCheckerMain {

    public static void main(String[] args) {

        NumberChecker checkNum = (e)-> {    if(e%2==0&&e%5==0){
                 return true;
                  }
                 return false;
        };

        int [] num = {12,13,10,15,16,20,45,50};
        System.out.println("List of number : "+ Arrays.toString(num));
        for (int n:num){
            if(checkNum.check(n)){
                System.out.println(n+" : is even number and is divisible by 5 ");
            }
        }
    }
}
