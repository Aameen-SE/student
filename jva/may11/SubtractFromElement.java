package jva.may11;

import java.util.Arrays;

public class SubtractFromElement {
    public static void main(String[] args) {
        //wap to subtract -1 from each element of an array
        int []arr ={39,12,54,87,96,35,57,88};
        System.out.println("Original Array : "+Arrays.toString(arr));

        int sub=1;

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]-sub;
        }
        System.out.println("After Subtracting 1 from each element : "+Arrays.toString(arr));

    }
}
