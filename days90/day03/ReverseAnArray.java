package days90.day03;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr);
    }
    public static void rev(int[] arr){
        int rev[]=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
          rev[j]=arr[i];
          j++;
        }

        System.out.println(Arrays.toString(rev));
    }
}
