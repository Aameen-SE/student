package jva.may11;

import java.util.Arrays;

public class AddToEachElement {
    public static void main(String[] args) {
        //wap to add 5 to each element of an array
        int []arr ={39,12,54,87,96,35,57,88};
        System.out.println("Original Array : "+ Arrays.toString(arr));

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+5;
        }

        System.out.println("Adding 5 to each element in  Array : "+ Arrays.toString(arr));

    }
}
