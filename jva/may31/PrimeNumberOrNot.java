package jva.may31;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        
        boolean isPrime = true;
        if(num<=1){
            isPrime =false; 
        } else {
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }

        }

        if(isPrime)
            System.out.println("Prime Number ");
        else
            System.out.println("Not Prime Number ");
    }
}
