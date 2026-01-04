package practice2026.forloop.patternPrinting;

import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {

        //      *
        //		**
        //		***
        //		****

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =sc.nextInt();
        for(int row=0;row<num;row++){
            for(int col =0;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
