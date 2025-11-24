package leetcode.nov24;

import java.util.*;

class Solution {

    public static void main(String[] args){
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]
        //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        int []nums = {2,7,11,15};
        int target = 9;
        int[] arr =twoSum(nums,target);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] arr,int target){
    Map<Integer,Integer> map = new HashMap<>();

    for (int i=0;i<arr.length;i++){
        int diff = target-arr[i];

        if(map.containsKey(diff)){
            return new int[]{map.get(diff),i};
        }
        map.put(arr[i],i);
    }
return new int []{-1,-1};
    }

}