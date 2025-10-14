package dailypractice.oct.oct14;

import java.util.Scanner;

public class FactorialOfNum {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number to find its factorial : ");
        int num = scanner.nextInt();
        int fact =1;
        while(num>0){
            fact=fact*num;
            num--;
        }

        System.out.println("Factorial of the given number is :"+fact);
    }
}
