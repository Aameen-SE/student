package training;

// declare java scanner add java.util.Scanner

import java.util.Scanner;

public class ScannerProgram {

    public static void main(String[] args) {
        //
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter the first value  ");//print
        int a = input.nextInt(); // stored value

        System.out.println("Enter the second value : "); //
        int b = input.nextInt();

        int result = a + b;
        //char c = input.next().charAt(1);
       // int rollNo = input.nextInt();

        System.out.println("Result : "+result);


    }
}
