package corejava.aug08;

import java.util.Scanner;

public class Pattern33 {
    //creat a class having name Pattern, then add methods to print all patterns like increaseStar, decreaseStar, increaseStartFromRight,
    //		decreaseStartFromRight, diamond, pyramid, reversePyramid. All these methods will accept one int argument and will not return anything.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();


        System.out.println("Increase Star");
                 increaseStar(num);
       System.out.println("Decrease Star");
                 decreaseStar(num);
        System.out.println("Increase Star from right Side ");
                icreaseStarFromRight(num);
        System.out.println("Decrease Star from right side ");
                   decreaseStarFromRight(num);
    }

    public static void increaseStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void decreaseStar(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void icreaseStarFromRight(int n){
        for(int i=1;i<=n;i++){
            for(int space =i;space<n;space++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static void decreaseStarFromRight(int n){
        for(int i=1;i<=n;i++){
            for(int space =1;space<i;space++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }









}
