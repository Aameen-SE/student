package jva.forlop;

public class PrimeNumber {
    public static void main(String[] args) {
        //Print prime numbers between 1 to 50 using a for loop.

        for(int i=2;i<=50;i++){
             boolean isPrime = true;

             for(int j =2;j<=Math.sqrt(i);j++){
                 if(i%j==0){
                     isPrime=false;
                     break;
                 }
             }

             if(isPrime)
                 System.out.print(i+" ");
        }
    }
}
