package numberingsystem.hexadecimaltobinary;

public class Prog8 {
    public static void main(String[] args) {

        String input = "FA";

        int decimal = Integer.parseInt(input, 16);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary value  : " + binary);
    }
}
