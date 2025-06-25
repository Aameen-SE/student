package numberingsystem.binarytooctal;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary value : ");
        String input = sc.nextLine();

        int decimal= Integer.parseInt(input,2);
        String octalValue = Integer.toOctalString(decimal);
        System.out.println("Octal Value of binary value is : "+octalValue);
    }
}
