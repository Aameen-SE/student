package numberingsystem.binarytohexadecimal;

public class Prog3 {

    public static void main(String[] args) {

        String input = "11011";

        int decimal = Integer.parseInt(input,2);
        String hexadecimalValue= Integer.toHexString(decimal).toUpperCase();
        System.out.println("HexaDecimal Value  :"+hexadecimalValue);
    }
}
