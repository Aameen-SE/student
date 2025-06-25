package numberingsystem.octaltobinary;

public class Prog3 {
    public static void main(String[] args) {
        String octalInput = "344";

        int decimal = Integer.parseInt(octalInput,8);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Value : "+binary);
    }
}
