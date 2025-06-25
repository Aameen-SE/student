package numberingsystem.binarytooctal;

public class Prog10 {
    public static void main(String[] args) {

        String input = "101010101010";

        int decimal= Integer.parseInt(input,2);
        String octalValue = Integer.toOctalString(decimal);
        System.out.println("Octal Value of binary value is : "+octalValue);
    }
}
