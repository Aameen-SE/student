package dailypractice.jul15;

import java.util.Arrays;

public class CopyTwoArrIntoOne {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {11,12,13,14,15,16};
        System.out.println("Arr1 : "+Arrays.toString(arr1));
        System.out.println("Arr2 : "+Arrays.toString(arr2));

        int size = arr1.length+arr2.length;
        int[] arr3 = new int[size];

        for(int i =0;i< arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int k = arr1.length;
        for(int j =0;j<arr2.length;j++){

            arr3[k] =arr2[j];
            k++;
        }

        System.out.println("Arr3 : "+Arrays.toString(arr3));
    }
}
