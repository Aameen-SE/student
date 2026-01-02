package practice2026.ternary;

import java.util.Scanner;

public class TernayProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second number : ");
        int num2 = sc.nextInt();



        greatestAmongTwo(num1,num2);
        smallestAmongTwo(num1,num2);
        checkEvenBetweenTwo(num1,num2);
        checkOddBetweenTwo(num1,num2);

    }

    public static void greatestAmongTwo(int num1, int num2){
        int greatestNum = num1 >num2?num1:num2;
        System.out.println("Greatest Number among two is :"+greatestNum);
    }

    public static void smallestAmongTwo(int num1, int num2){
        int smallestNum = num1 <num2?num1:num2;
        System.out.println("SmallestNum Number among two is :"+smallestNum);
    }

    public static void checkEvenBetweenTwo(int num1,int num2){
        int evenNum = num1%2==0? num1 : (num2%2==0) ? num2 : 0;
        System.out.println("Even Number between two is : "+evenNum);
    }
    public static void checkOddBetweenTwo(int num1,int num2){
        int oddNum = num1%2!=0? num1 : (num2%2!=0) ? num2 : 0;
        System.out.println("Odd Number between two is : "+oddNum);
    }


}
