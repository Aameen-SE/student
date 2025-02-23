package javacore.methd;

import java.util.Arrays;

public class Program11 {
    public static void main(String[] args) {
        //int greatest(int[]), find greatest element of an array and return that greatest value

        int[] arr = {12,45,32,65,89};
        System.out.println(Arrays.toString(arr));
        int result =greatestValue(arr);
        System.out.println("Greatest Value in the given Array are : "+result);

    }
    public static int greatestValue(int[]arr){
        int gV=arr[0];
        for(int i=1;i<arr.length;i++){
            if(gV<arr[i])
                gV=arr[i];
        }
        return gV;
    }

}
