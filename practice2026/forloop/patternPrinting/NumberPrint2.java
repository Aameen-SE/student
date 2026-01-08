package practice2026.forloop.patternPrinting;

import java.util.Scanner;

public class NumberPrint2 {
    public static void main(String[] args) {
        //      1
        //		2 2
        //		3 3 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int col =1;col<=i;col++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
