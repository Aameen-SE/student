package typecasting.explicit;

import java.util.Scanner;

public class Prog6 {
    //Take user input as float and cast to int.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the float variable value : ");
        float var = sc.nextFloat();

        int varInt = (int)var;
        System.out.println("Result in int value : "+varInt);

    }
}
