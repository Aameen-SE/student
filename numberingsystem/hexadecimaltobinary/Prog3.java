package numberingsystem.hexadecimaltobinary;

public class Prog3 {
    public static void main(String[] args) {

        String input = "7F";

        int decimal = Integer.parseInt(input, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary value  : " + binary);
    }
}
