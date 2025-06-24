package jva.patternprinting;

import java.util.Scanner;

public class NumberPrinting {
    public static void main(String[] args) {
        //      1
        //		1 2
        //		1 2 3
        int num =5;

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
