package jva.arry;

import java.util.Arrays;

public class Add2ArryCopy {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int [] arr2={10,11,12,13,14,15,16,17,18};

        int sum[] = new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            sum[i]=arr1[i]+arr2[i];
        }
        System.out.println(Arrays.toString(sum));
    }
}
