package practice2026.forloop;

import java.util.Scanner;

public class SumOfFirstLastDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num=sc.nextInt();

        sumOfFirstLastDigit(num);

    }

    public static void sumOfFirstLastDigit(int num){
        int sum = firstDigit(num) + lastDigit(num);
        System.out.println("Sum of the first and last digit : "+sum);

    }

    public static int firstDigit(int num){
        int firstDigit = num;
        for(;firstDigit>=10;){
            firstDigit=firstDigit/10;
        }
        return firstDigit;}

    public static int lastDigit(int num){
return num%10;
    }
}
