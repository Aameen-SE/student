package dailypractice.nov.nov18;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int n =checkEven(num);
        if(n==1)
            System.out.println("Given Num : "+ num+" is Even Number");
        else
            System.out.println("Given Num : "+ num+" is Odd Number");
    }

    public static int checkEven(int num){
        if((num&1)==1)
            return -1;

        return 1;
    }
}
