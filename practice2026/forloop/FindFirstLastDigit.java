package practice2026.forloop;

import java.util.Scanner;

public class FindFirstLastDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        firstDigit(num);
        lastDigit(num);

    }
    public static void firstDigit(int num){
       int firstDigit=num;

       for(;firstDigit>=10;){
           firstDigit=firstDigit/10;
       }

        System.out.println("First Digit of the num is :"+firstDigit);
    }
    public static void lastDigit(int num){
        int lastdigit = num%10;
        System.out.println("LastDigit of the number : "+lastdigit);

    }
}
