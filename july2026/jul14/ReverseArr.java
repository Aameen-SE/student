package july2026.jul14;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rev(arr);
        System.out.println("Reverse Array : "+Arrays.toString(arr));
       // revArr(arr);
    }
    public static void rev(int[]arr){
        int start = 0;
        int end =arr.length-1;
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void revArr(int[] arr){
      int[] rev = new int[arr.length];
      int j=arr.length-1;
      for (int a:arr){
          rev[j]=a;
          j--;
      }
        System.out.println("Reverse Array : "+Arrays.toString(rev));
    }
}
