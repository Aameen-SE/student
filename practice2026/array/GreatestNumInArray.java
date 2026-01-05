package practice2026.array;

import java.util.Arrays;

public class GreatestNumInArray {

    public static void main(String[] args) {

        int[] arr ={1,20,3,4,5};
        System.out.println("Arrays : "+ Arrays.toString(arr));
        int max =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println("Greatest Element in array is : "+max);
    }
}
