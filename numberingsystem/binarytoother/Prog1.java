package numberingsystem.binarytoother;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        String input = sc.nextLine();

        int decimal = Integer.parseInt(input,2);

        System.out.println("Decimal : "+decimal);

    }
}
