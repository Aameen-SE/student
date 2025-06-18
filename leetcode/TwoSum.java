package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers
    // such that they add up to the target.
    public static void main(String[] args) {
    int [] arr={12,24,51,8,78,96,14,5};
    int target =17;
    int[] result= twoSum(arr,target);
        System.out.println("Indices : "+result[0]+" , "+result[1]);
    }
        public static int[] twoSum(int[] arr, int target){

            Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement = target-arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
        }
}
