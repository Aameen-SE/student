package dailypractice.jul15;


import java.util.Arrays;

public class ReverseArr {

    public static void main(String[] args) {

        int[] arr = {12,14,15,16,17,18,19};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        int[] reverseArr = new int[arr.length];
        int j=0;

        for(int i=arr.length-1;i>=0;i--){
            reverseArr[j]=arr[i];
            j++;
        }

        System.out.println("Reverse Array : "+ Arrays.toString(reverseArr));
    }
}
