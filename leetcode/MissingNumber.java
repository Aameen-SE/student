package leetcode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        //Given an array nums containing n distinct numbers in range returns the only number in the range that is missing from the
        //array

        int [] arr ={1,2,3,0,4};
       int n= missingNum(arr);
        System.out.println(n);

    }
    static int missingNum(int[]arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i!=arr[i])
                return i;
        }
        return arr.length;
    }


}
