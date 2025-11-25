package dailypractice.nov.nov25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberFromArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        findPrime(arr);
    }

    public static void findPrime(int[] arr){
        List<Integer> primeList = new ArrayList<>();


        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                primeList.add(arr[i]);
            }
        }

        System.out.println(primeList);
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
