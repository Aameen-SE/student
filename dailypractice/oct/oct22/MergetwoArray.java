package dailypractice.oct.oct22;

import java.util.Arrays;

public class MergetwoArray {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int size=arr1.length+arr2.length;
        int [] merge= new int[size];

        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }
        int k=0;
        for(int i=arr1.length;i<size;i++){
            merge[i]=arr2[k];
            k++;
        }

        System.out.println(Arrays.toString(merge));
    }
}
