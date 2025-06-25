package numberingsystem.decimaltobinary;

public class Prog10 {
    public static void main(String[] args) {
        int input = 200;
        System.out.println("Decimal : "+input);
        String binaryValue = Integer.toBinaryString(input);
        System.out.println("Binary : "+binaryValue);
    }
}
