package jva.arry;

import java.util.Arrays;

public class DivideElementBy2 {
    public static void main(String[] args) {
        //wap to to divide each element of an array by 2.
        //		Suppose given array is [10, 19, 2, 7] -> our program will divide each element by 2

        double arr[]={12,23,43,56,78,89};
        System.out.println("Arrays before dividing by 2 : "+ Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/2;
        }
        System.out.println("Arrays after dividing by 2 : "+ Arrays.toString(arr));
    }
}
