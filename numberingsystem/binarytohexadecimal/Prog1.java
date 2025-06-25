package numberingsystem.binarytohexadecimal;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value : ");
        String input = sc.nextLine();

        int decimal = Integer.parseInt(input,2);
        String hexadecimalValue= Integer.toHexString(decimal).toUpperCase();
        System.out.println("HexaDecimal Value  :"+hexadecimalValue);
    }
}
