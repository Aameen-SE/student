package july2026;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        //reverse(arr);
        rev(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void rev(int[]arr){
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

    }

    public static void reverse(int[] arr){
        int rev[] = new int[arr.length];
        int num=0;
        for(int a=arr.length-1;a>=0;a--){
            rev[num]=arr[a];
            num++;
        }

        System.out.println("Reverse of an Arrays : "+ Arrays.toString(rev));
    }
}
