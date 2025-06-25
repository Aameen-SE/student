package numberingsystem.binarytodecimal;

public class Prog8 {
    public static void main(String[] args) {
        String input = "100110";

        int decimalValue = Integer.parseInt(input,2);
        System.out.println("Decimal : "+decimalValue);
    }
}
