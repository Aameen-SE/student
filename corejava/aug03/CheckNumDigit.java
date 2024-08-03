package corejava.aug03;

import java.util.Scanner;

public class CheckNumDigit {
    public static void main(String[] args) {
        //Wap to print double if number is a double digit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num =sc.nextInt();

        doubleDigit(num);
        singleDigit(num);
        tripleDigit(num);
    }

    public static void doubleDigit(int num){
        ////Wap to print double if number is a double digit
        if(num>=10||num<100)
            System.out.println("Double ");
        else
            System.out.println("Number is not a double digit");
    }

    public static void singleDigit(int num){
        //Wap to print single if number is single digit
        if(num<=9||num>=0)
            System.out.println("Single  ");
        else
            System.out.println("Number is not a single  digit");
    }

    public static void tripleDigit(int num){
        //Wap to print ternary if number is 3 digit
        if(num>=100||num<1000)
            System.out.println("Ternary  ");
        else
            System.out.println("Number is not a ternary  digit");
    }

}
