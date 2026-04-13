package days90.day03;

import java.util.Arrays;

public class MovesZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        movesZero(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void movesZero(int[] arr){
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
                pos++;
            }
        }
        while(pos<arr.length){
            arr[pos]=0;
            pos++;
        }

    }
}
