package dailypractice.nov.nov18;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ?");
        int num = sc.nextInt();

        boolean result =checkPrime(num);
        if(result)
            System.out.println("Given Num :"+num+" is Prime Number");
        else
            System.out.println("Given Num :"+num+" is Not Prime Number");

    }

    public static boolean checkPrime(int num){
        if(num<=1)
            return false;
        else {
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        }
        return true;
    }

}
