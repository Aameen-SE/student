package practice2026.forloop;

import java.util.Scanner;

public class PrimeNumberOrNot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        checkPrime(num);
    }

    public static void checkPrime(int num){
        if(isPrime(num))
            System.out.println("Prime Number ");
        else
            System.out.println("Not Prime Number");
    }

    public static boolean isPrime(int num){
        boolean prime= true;
        if(num==1){
            prime=false;
            return prime;
        }else {
            for(int i=2;i*i<num;i++){
                if(num%i==0)
                    prime=false;
                break;
            }
        }
        return prime;
    }
}
