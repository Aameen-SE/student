package javacore.methd;

import java.util.Arrays;

public class Problem8 {
    public static void main(String[] args) {
        //void copy(int[], int[]), copy first array to second array
        int[] arr1={12,32,45,67,87};
        int[] arr2=new int[arr1.length];

        copy(arr1,arr2);

    }
   public static void copy(int[]ar1, int[]ar2){
       ar2=new int[ar1.length];
       for(int i =0;i< ar1.length;i++){
           ar2[i]=ar1[i];
       }
       System.out.println(Arrays.toString(ar2));
    }


}
