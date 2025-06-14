package jva.ternaryoperat;

import java.util.Scanner;

public class Category {
    public static void main(String[] args) {
        //Use nested ternary to determine category: age <13 → "Child", 13–19 → "Teen", else "Adult".
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        String result =(age<13)? "Child ":
                (age<19)?"Teen" : "Adult";

        System.out.println(result );
    }
}
