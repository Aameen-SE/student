package numberingsystem.binarytodecimal;

public class Prog2 {
    public static void main(String[] args) {
        String input = "1111";
        System.out.println("Binary number : "+input);
        int decimalValue = Integer.parseInt(input,2);
        System.out.println("Decimal : "+decimalValue);
    }
}
