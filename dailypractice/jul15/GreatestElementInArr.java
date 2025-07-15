package dailypractice.jul15;

import java.util.Arrays;

public class GreatestElementInArr {

    public static void main(String[] args) {

        int[] arr = {12,14,15,16,170,18,19};
        System.out.println("Original Array : "+ Arrays.toString(arr));

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Greatest Element in array : "+max);
    }
}
