package dailypractice.jul15;

import java.util.Arrays;

public class SumOfArr {

    public static void main(String[] args) {

        int[] arr = {12,14,15,16,17,18,19};
        System.out.println("Original Array : "+ Arrays.toString(arr));
         int sum=0;

        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of the element in array : "+sum);
    }
}
