package numberingsystem.binarytodecimal;

public class Program1 {
    public static void main(String[] args) {
        String input = "1010";

        int decimalValue = Integer.parseInt(input,2);
        System.out.println("Decimal : "+decimalValue);
    }
}
