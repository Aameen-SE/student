package dailypractice.oct.arry;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        int [] arr ={12,130,45,67,98,100,};
        System.out.println("OriginalGiven Array : "+ Arrays.toString(arr));

        reverse(arr);
    }

    public static void reverse(int[] arr){

        int j=0;
        int reverse[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){
            reverse[j]=arr[i];
            j++;
        }

        System.out.println("Reverse Array of the given Array :"+Arrays.toString(reverse));
    }
}
