package dsa.june01;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // remove duplicates
        int[] arr={14,52,36,14,74,15,25,4,14};

        removeDuplicates(arr);
    }
    public static void removeDuplicates(int[]arr){
            int temp[]=new int[arr.length];
            int j=0;

        for(int i=0;i<arr.length;i++){

            boolean isDuplicate=false;


            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j] = arr[i];
                j++;
            }

        }

        int[] uniqueArr = Arrays.copyOf(temp,j);
        System.out.println("Arrays :  after removing duplicate : "+Arrays.toString(uniqueArr));

    }
}
