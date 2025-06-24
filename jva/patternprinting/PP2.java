package jva.patternprinting;

import java.util.Scanner;

public class PP2 {
    public static void main(String[] args) {
      //            *
        //		   **
        //	      ***
        //	     ****

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of star you want : ");
        int num = sc.nextInt();

        for(int i=num;i>=1;i--){

            for(int space =1;space<i;space++){
                System.out.print(" ");
            }

            for(int j=0;j<=num-i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
