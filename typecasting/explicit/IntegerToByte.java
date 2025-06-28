package typecasting.explicit;

import java.util.Scanner;

public class IntegerToByte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int value = sc.nextInt();

        byte var = (byte)value;
        System.out.println("Byte value of given integer value is : "+var);
    }
}
