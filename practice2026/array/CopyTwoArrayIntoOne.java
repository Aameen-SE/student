package practice2026.array;

import java.util.Arrays;

public class CopyTwoArrayIntoOne {

    public static void main(String[] args) {

        int [] arr1={1,2,3,4,5};
        System.out.println("Array1 : "+Arrays.toString(arr1));
        int [] arr2={6,7,8,9,10};
        System.out.println("Array2 : "+Arrays.toString(arr2));

        int size = arr1.length+arr2.length;

        int mergeArr[] = new int[size];

        for(int i=0;i<arr1.length;i++){
            mergeArr[i]=arr1[i];
        }

        int j=0;
        for(int i=arr1.length;i<size;i++){
            mergeArr[i]=arr2[j];
            j++;
        }

        System.out.println("Merge Array  : "+ Arrays.toString(mergeArr));
    }
}
