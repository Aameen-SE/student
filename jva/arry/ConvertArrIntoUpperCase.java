package jva.arry;

import java.util.Arrays;

public class ConvertArrIntoUpperCase {
    public static void main(String[] args) {
        //
        char arr[]={'a','b','c','d'};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
           arr[i]=Character.toUpperCase(arr[i]);

        }
        System.out.println(Arrays.toString(arr));
    }
}
