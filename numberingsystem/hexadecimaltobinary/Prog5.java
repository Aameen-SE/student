package numberingsystem.hexadecimaltobinary;

public class Prog5 {
    public static void main(String[] args) {

        String input = "FFF";

        int decimal = Integer.parseInt(input, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary value  : " + binary);
    }
}
