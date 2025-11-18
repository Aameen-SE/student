package dailypractice.nov.nov18;

import java.util.Scanner;

public class PrintAccToNum {
    //Wap to print zero if number zero, 1 if positive and -1 if number is negative

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num = scanner.nextInt();

        System.out.println("Print 0 number zero, 1 if positive and -1 if number is negative");
       int result = printNum(num);
        System.out.println(result);

    }
    public  static int printNum(int num){
        if(num==0)
            return 0;
        else if (num>0) {
            return 1;
        }
        else
            return -1;
    }

}
