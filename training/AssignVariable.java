package training;

import java.util.Scanner;

public class AssignVariable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=90;

        int result = a + b;

        int subResult = b-a;

        int divResult =b/a;

        int multResult = b*a;

        int modulusResult = b%a;

        System.out.println(modulusResult);

    }
}
