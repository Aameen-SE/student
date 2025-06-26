package typecasting.implicit;

public class Prog3 {
    //Add a byte and short and store it in an int
    public static void main(String[] args) {
        byte a = 123;
        short b = 43;

        int result = a+b;
        System.out.println("Result : "+result);
    }
}
