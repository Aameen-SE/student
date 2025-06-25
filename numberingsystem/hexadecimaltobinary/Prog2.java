package numberingsystem.hexadecimaltobinary;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {

        String input = "F";

        int decimal = Integer.parseInt(input, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary value  : " + binary);
    }
}
