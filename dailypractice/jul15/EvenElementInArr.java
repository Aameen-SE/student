package dailypractice.jul15;

import java.util.Arrays;

public class EvenElementInArr {

    public static void main(String[] args) {

        int[] arr = {12,14,15,16,17,18,19};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Even element in array : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
