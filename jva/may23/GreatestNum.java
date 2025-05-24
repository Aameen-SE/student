package jva.may23;

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number num1 : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number num2 :");
        int n2=sc.nextInt();

        int greaterNum =(n1>n2)?n1:n2;
        System.out.println("Greater Number between two is : "+greaterNum);

        smallestNumber(n1,n2);
    }

    public static void smallestNumber(int n1, int n2){
        int smallNum = (n1<n2)?n1:n2;
        System.out.println("Smallest Number between two : "+smallNum);
    }
}
