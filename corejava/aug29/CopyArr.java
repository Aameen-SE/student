package corejava.aug29;

import java.util.Arrays;

public class CopyArr {
    public static void main(String[] args) {
        int[] arr={12,45,23,56,24,34,78,98,};
        System.out.println("Given Array :"+ Arrays.toString(arr));
       int[] arr2= new int[arr.length];
        int i;
       for( i=0;i<arr.length;i++){
           arr2[i]=arr[i];

       }
        System.out.println("Copied Array arr[2] : "+Arrays.toString(arr2));


    }
}
