package jva.may07;

import java.util.Scanner;

class UnderAge extends RuntimeException{
    UnderAge(String msg ){
        super(msg);
    }
}
// we are creating unchecked exception using throw
public class ThrowwTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age ");
        int age=sc.nextInt();
        try{
            if(age<=18){
                throw new UnderAge("Not eligible for Voting");
            }
            else
                System.out.println("Eligible for voting ");

        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("hello ");
    }
}
