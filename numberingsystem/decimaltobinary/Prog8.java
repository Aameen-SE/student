package numberingsystem.decimaltobinary;

public class Prog8 {
    public static void main(String[] args) {
        int input = 85;
        System.out.println("Decimal : "+input);
        String binaryValue = Integer.toBinaryString(input);
        System.out.println("Binary : "+binaryValue);
    }
}
