package practice2026.array;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        //wap to print all prime numbers from an array ?
        int[] arr = {11,12,13,14,15,16,17};
        List<Integer> prime = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i]))
                prime.add(arr[i]);
        }
        System.out.println("Prime Number in Array :"+prime);
    }
    public static boolean isPrime(int num){
        if(num==1)
            return false;
        else {
            for(int i=2;i*i<num;i++){
                if(num%i==0)
                    return false;
            }
        }
        return true;
    }
}
