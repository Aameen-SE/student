package dailypractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check whether its a prime or not ");
        int num = sc.nextInt();

        boolean result = checkPrime(num);
        if(result)
            System.out.println("Prime number ");
        else
            System.out.println("Not a prime number ");
    }

    public static boolean checkPrime(int num){

        if(num<=1){
            return false;
        }
        else {
            for(int i=2;i*i<=num;i++){
                if(num%i==0)
                    return false;
            }
        }
        return true;
    }
}
