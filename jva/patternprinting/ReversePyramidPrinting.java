package jva.patternprinting;

import java.util.Scanner;

public class ReversePyramidPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of star :");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int space=1;space<=i;space++){
                System.out.print(" ");
            }
            for(int j=num;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
