package jva.whilelop;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find even number from 1 to num : ");
        int num = sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=num){
            if(i%2==0) {
                sum = sum + i;
            }
            i++;
            }
        System.out.println("Sum of all the even number from 1 to n:"+num+" is  : "+sum);
    }
}
