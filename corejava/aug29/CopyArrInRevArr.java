package corejava.aug29;

import java.util.Arrays;

public class CopyArrInRevArr {
    public static void main(String[] args) {
        int[] arr = {12,15,14};
        System.out.println("Given Array :"+Arrays.toString(arr));
     int[] revArr = new int[arr.length];
     for(int i =0;i<arr.length;i++){
         revArr[i]=arr[arr.length-1-i];
     }

        System.out.println("Reverse Copied Array :"+Arrays.toString(revArr));
    }

}
