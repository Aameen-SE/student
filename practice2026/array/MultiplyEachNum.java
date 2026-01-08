package practice2026.array;

import java.util.Arrays;

public class MultiplyEachNum {
    public static void main(String[] args) {
        int[] arr ={10, 19, 2, 7};
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
