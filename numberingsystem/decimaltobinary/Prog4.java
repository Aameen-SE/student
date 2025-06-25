package numberingsystem.decimaltobinary;

import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Decimal : "+input);
        String binaryValue = Integer.toBinaryString(input);
        System.out.println("Binary : "+binaryValue);
    }
}
