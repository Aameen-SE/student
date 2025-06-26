package typecasting.implicit;

public class Prog7 {
    public static void main(String[] args) {
        //Add byte, short, and int in a single expression. Store result in long.
        byte varByte = 12;
        short varShort = 45;
        int varInt=56;
        long result = varInt+varByte+varShort;
        System.out.println("Result : "+result);
    }
}
