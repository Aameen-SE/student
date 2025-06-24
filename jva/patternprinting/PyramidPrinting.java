package jva.patternprinting;

import java.util.Scanner;

public class PyramidPrinting {
    public static void main(String[] args) {
        //         *
        //		  * *
        //		 * * *
        //		* * * *

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe rof star to see :");
        int num=sc.nextInt();

        /*for(int i=0;i<num;i++){
            for(int space = num-i;space>1;space--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/

        for(int i=0;i<num;i++){
            for(int space = num-i;space>1;space--){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
