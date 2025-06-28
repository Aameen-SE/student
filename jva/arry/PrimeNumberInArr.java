package jva.arry;

import java.util.Arrays;

public class PrimeNumberInArr {
    public static void main(String[] args) {
        int arr[]={12,13,14,15,16,17,18};
        System.out.println("Array : "+ Arrays.toString(arr));
        System.out.println("Prime Number in Array : ");
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" , ");
            }
        }

    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
