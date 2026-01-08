package practice2026.forloop.patternPrinting;

import java.util.Scanner;

public class NumberPrint {
    public static void main(String[] args) {
        //      1
        //		1 2
        //		1 2 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt(); // 5

        for(int row=1;row<=num;row++){
            for(int col =1;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }


    }
}
