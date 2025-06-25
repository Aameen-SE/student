package numberingsystem.binarytoother;

import java.util.Scanner;

public class BinaryToHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number to be converted into hexa : ");
        String input = sc.nextLine();

        int decimalValue = Integer.parseInt(input,2);

        String hexaDecimal = Integer.toHexString(decimalValue);
        System.out.println("Hexadecimal equivalent: " + hexaDecimal.toUpperCase());

        sc.close();


    }
}
