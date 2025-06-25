package numberingsystem.hexadecimaltobinary;

public class Prog9 {
    public static void main(String[] args) {

        String input = "C1";

        int decimal = Integer.parseInt(input, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary value  : " + binary);
    }
}
