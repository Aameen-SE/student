package arrayy;

import java.util.Arrays;

public class EvenElementInArray {

    public static void main(String[] args) {

        int[] arr = {12,15,161,718,19};
        System.out.println("Arrays : "+ Arrays.toString(arr));
        System.out.println("Even Element in array : ");
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+", ");
            }
        }

    }
}
