package dailypractice.jul15;

import java.util.Arrays;

public class SumTwoArrElement {

    public static void main(String[] args) {

        //int[] arr = {12,14,15,16,17,18,19};

        int[] arr1 = {12,14,15,16,17,18,19};
        int[] arr2 = {12,14,15,16,17,18,19};

        System.out.println("Array 1 : "+Arrays.toString(arr1));
        System.out.println("Array 2 : "+Arrays.toString(arr2));


        int[] newArr3 = new int[arr1.length];
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                newArr3[i]=arr1[i]+arr2[i];
            }

        }
        System.out.println("Sum of the element in two array and copy into third Array : "+Arrays.toString(newArr3));
    }
}
