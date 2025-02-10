package javacore.ifelse;

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        //wap to for a given length and breadth of a rectangle check if it is square or not.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle :");
        int breadth = sc.nextInt();

        if(length==breadth)
            System.out.println("It is a square ");
        else
            System.out.println("It is not a square ");
    }
}
