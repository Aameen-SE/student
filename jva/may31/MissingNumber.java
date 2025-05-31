package jva.may31;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};

        System.out.println(Arrays.toString(arr));
        int n =arr.length+1;
        int totalSum= n*(n+1)/2;

        int actualSum=0;
        for(int a:arr){
            actualSum=actualSum+a;
        }

        int missingNum = totalSum-actualSum;
        System.out.println("Missing num : "+missingNum);
    }
}
