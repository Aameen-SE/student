package numberingsystem.octaltobinary;

public class Prog6 {
    public static void main(String[] args) {
        String octalInput = "200";

        int decimal = Integer.parseInt(octalInput,8);
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary Value : "+binary);
    }
}
