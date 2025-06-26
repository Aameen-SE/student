package typecasting.implicit;

public class Prog1 {
    public static void main(String[] args) {
        //Assign an int value to a long variable
        int varInt = 12;
        System.out.println("Integer value of the variable : "+varInt);
        long varLong = varInt;
        System.out.println("Long value of the int  variable after asigning to long  : "+varLong);

    }
}
