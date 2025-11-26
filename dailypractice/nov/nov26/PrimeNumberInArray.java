package dailypractice.nov.nov26;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberInArray {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6};

        primeArr(arr);

    }
    public static void primeArr(int[] arr){
        List<Integer> primeList = new ArrayList<>();

        for(int a:arr){
            if(isPrime(a)){
                primeList.add(a);
            }
        }

        System.out.println(primeList);
    }

    public static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }

}
