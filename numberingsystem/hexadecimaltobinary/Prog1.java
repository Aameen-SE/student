package numberingsystem.hexadecimaltobinary;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hexadecimal value : ");
        String input = sc.nextLine();

        int decimal = Integer.parseInt(input,16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary value  : "+binary);
    }
}
