package jva.forlop;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till to find evenNumber from 1 to n: ");
        int num = sc.nextInt();
        int sum =0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sum =sum+i;
            }
        }

        System.out.println("Sum of all the even number from 1 to "+num+" is : "+sum);
    }
}
