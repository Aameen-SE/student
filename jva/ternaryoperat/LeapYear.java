package jva.ternaryoperat;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");

        int year = sc.nextInt();

        String result = (year%4==0&&year%100!=0||year%400==0)? "It is a Leap Year " : "It is not a leap year";

        System.out.println(result);
    }
}
