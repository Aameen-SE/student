package dailypractice.oct.oct20;

import java.util.Arrays;

public class CopyTwoArrIntoOne {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};

        int size = arr1.length+arr2.length;
        int [] newArr = new int[size];

        for(int i=0;i<arr1.length;i++){
            newArr[i]=arr1[i];
        }

        int k =0;
        for(int j=arr1.length;j<size;j++){
            newArr[j]=arr2[k];
            k++;
        }
        System.out.println(Arrays.toString(newArr));

    }


}
