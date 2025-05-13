package jva.may12.exceptn;

import java.util.Scanner;

class YoungerException extends Exception{
    YoungerException(String msg){
        super(msg);
    }
}
public class Voting {
    public static void main(String[] args) throws YoungerException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        if(age<18){
            throw new YoungerException("Not eligible to vote ");
        }
        else {
            System.out.println("Eligible to vote ");
        }
    }
}
