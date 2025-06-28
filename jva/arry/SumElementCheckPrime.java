package jva.arry;

import java.util.Arrays;

public class SumElementCheckPrime {
    public static void main(String[] args) {
        //	wap to add all elements of an array and check wether the sum is a prime number or not?
        //		Suppose given array is [10, 19, 2, 7] -> sum=38 is not a prime number
        int[] arr={10, 19, 2, 6};
        System.out.println("Array : "+ Arrays.toString(arr));
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("Sum of the all element in array :"+sum);
        boolean result= checkPrime(sum);

        if(result)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number ");

    }
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        } else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
