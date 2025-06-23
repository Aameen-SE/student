package jva.patternprinting;

import java.util.Scanner;

public class LeftSideReverse {
    public static void main(String[] args) {
        //      ****
        //		 ***
        //		  **
        //		   *
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stars");
        int num = sc.nextInt();

        for(int i=num;i>=1;i--){
            for(int space = i;space<num;space++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
