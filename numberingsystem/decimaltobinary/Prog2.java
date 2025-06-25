package numberingsystem.decimaltobinary;

public class Prog2 {
    public static void main(String[] args) {
        int input = 18;
        System.out.println("Decimal : "+input);
        String binaryValue = Integer.toBinaryString(input);
        System.out.println("Binary : "+binaryValue);
    }
}
