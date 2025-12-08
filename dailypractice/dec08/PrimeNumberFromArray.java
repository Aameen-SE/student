package dailypractice.dec08;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFromArray {
    public static void main(String[] args) {

        int[] num ={1,2,3,4,5,6,7,8,9,11};
        primeList(num);
    }
    public static void primeList(int[] num){
        List<Integer> primeList = new ArrayList<>();
        for(int n:num){
            if(isPrime(n)){
                primeList.add(n);
            }
        }

        System.out.println("List of prime number from array : "+primeList);
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
