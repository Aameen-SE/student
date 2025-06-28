package jva.arry;

import java.util.Arrays;

public class SumOddElement {
    public static void main(String[] args) {
        int[] arr={ 10, 19, 2, 7};
        System.out.println("Array : "+ Arrays.toString(arr));
        int sum=0;

        System.out.println("Odd Element in array : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" , ");
                sum=sum+arr[i];
            }
        }
        System.out.println("\nSum of the odd element is : "+sum);
    }
}
