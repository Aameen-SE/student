package practice2026.forloop.patternPrinting;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        //      ****
        //		 ***
        //		  **
        //		   *

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num =sc.nextInt();

        for(int row=1;row<=num;row++){
            for(int space =1;space<row;space++){
                System.out.print(" ");
            }
            for(int col=num;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
