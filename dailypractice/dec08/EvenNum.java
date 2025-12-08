package dailypractice.dec08;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        //	4.	wap to print first five even numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num=sc.nextInt();

        boolean result = checkEven(num);
        if(result)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

    }

    public static boolean checkEven(int num){
        if((num&1)==1)
            return false;
        return true;
    }
}
