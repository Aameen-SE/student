package jva.arry;

import java.util.Arrays;

public class MultiplyEachElement {
    public static void main(String[] args) {
        int arr[]={12,23,24,45,65,76};
        int muliValue = 3;
        System.out.println("Arrays before multiplication : "+ Arrays.toString(arr));
        System.out.println("Multiplication value : "+muliValue);

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*muliValue;
        }
        System.out.println("Arrays after multiplication : "+ Arrays.toString(arr));
    }
}
