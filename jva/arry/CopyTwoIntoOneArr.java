package jva.arry;

import java.util.Arrays;

public class CopyTwoIntoOneArr {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9};
        int [] arr2={10,11,12,13,14,15};

        System.out.println("Array1 : "+Arrays.toString(arr1));
        System.out.println("Array2 : "+Arrays.toString(arr2));
        int size = arr1.length+arr2.length;

        int mergeArr [] = new int[size];

        for(int i=0;i<arr1.length;i++){
            mergeArr[i]=arr1[i];
        }
        int j=arr1.length;
        for(int i=0;i<arr2.length;i++){
            mergeArr[j]=arr2[i];
            j++;
        }
        System.out.println("Merge Array of both the array : ");
        System.out.println(Arrays.toString(mergeArr));

    }
}
