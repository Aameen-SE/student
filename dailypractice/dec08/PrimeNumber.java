package dailypractice.dec08;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num =sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime");
        }else
            System.out.println("Not Prime");

    }

    public static boolean isPrime(int num){
        for(int i=2;i*i<num;i++){
            if(num%i==0)
                return false;
        }
            return true;
            }
}
