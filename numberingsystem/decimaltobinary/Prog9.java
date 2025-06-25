package numberingsystem.decimaltobinary;

public class Prog9 {
    public static void main(String[] args) {
        int input = 128;
        System.out.println("Decimal : "+input);
        String binaryValue = Integer.toBinaryString(input);
        System.out.println("Binary : "+binaryValue);
    }
}
