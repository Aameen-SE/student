package typecasting.explicit;

public class Prog5 {
    //Cast result of double / int to int.
    public static void main(String[] args) {
        double var = 89.6;
        int varInt=3;

        int result = (int) var/varInt;
        System.out.println(result);

    }
}
