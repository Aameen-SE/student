package dailypractice.jul15;

import java.util.Arrays;

public class PrimeNumberinArray {

    public static void main(String[] args) {

        int[] arr = {11,12,13,14,15,16};
        System.out.println("Array : "+ Arrays.toString(arr));

        System.out.println("Prime Number in Array : ");
       for(int i =0;i<arr.length;i++){
           if(isPrime(arr[i])){
               System.out.print(arr[i]+" , ");
           }
       }
    }

    public static boolean isPrime(int n){
        if(n<=1) {
            return false;
        } for(int j =2;j<Math.sqrt(n);j++){

            if(n%j==0){
                return false;
            }
        }
        return true;
    }
}
