package forwhile;

import java.util.Scanner;

public class FactorialOfNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial : ");
        int num =sc.nextInt();

        int fact=1;

        for(int i=num;i>=2;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of the given number is : "+fact);
    }
}
