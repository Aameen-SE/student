package numberingsystem.binarytohexadecimal;

public class Prog4 {

    public static void main(String[] args) {

        String input = "100110";

        int decimal = Integer.parseInt(input,2);
        String hexadecimalValue= Integer.toHexString(decimal).toUpperCase();
        System.out.println("HexaDecimal Value  :"+hexadecimalValue);
    }
}
