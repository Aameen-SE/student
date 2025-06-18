package jva.arry;

import java.util.Arrays;

public class MergeSortArr {
    public static void main(String[] args) {
        //Merge two arrays and print the sorted result.
        int [] arr1 ={6,7,8,1,2,3,4,5};
        int [] arr2 ={11,23,45,65,89};

        System.out.println("Array 1 :"+Arrays.toString(arr1));
        System.out.println("Array 2 :"+Arrays.toString(arr2));

        int n1 = arr1.length;
        int n2=arr2.length;
        int size =n1+n2;
        int mergerArr[] = new int[size];

        for(int i=0;i<n1;i++){
            mergerArr[i]=arr1[i];
        }

        for (int i=0;i<n2;i++){
            mergerArr[n1+i]=arr2[i];
        }

        Arrays.sort(mergerArr);

        System.out.println("Merge array : "+Arrays.toString(mergerArr));
    }
}
