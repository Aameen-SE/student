package dailypractice.nov.nov26;

import java.util.Arrays;

public class CopyTwoArrayIntoOne {

    public static void main(String[] args) {

        int arr1[]= {1,2,3};
        int arr2[]= {4,5,6};

        copyArray(arr1,arr2);
    }

    public static void copyArray(int[] arr1, int [] arr2){
        int size = arr1.length+arr2.length;
        int mergeArr[] = new int[size];

        for(int i=0;i< arr1.length;i++){
            mergeArr[i]=arr1[i];
        }

        int k=0;
        for(int j=arr1.length;j<size;j++){
            mergeArr[j]=arr2[k];
            k++;
        }

        System.out.println(Arrays.toString(mergeArr));
    }
}
