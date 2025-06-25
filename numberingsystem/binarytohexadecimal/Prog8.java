package numberingsystem.binarytohexadecimal;

public class Prog8 {

    public static void main(String[] args) {

        String input = "111100001111";

        int decimal = Integer.parseInt(input,2);
        String hexadecimalValue= Integer.toHexString(decimal).toUpperCase();
        System.out.println("HexaDecimal Value  :"+hexadecimalValue);
    }
}
