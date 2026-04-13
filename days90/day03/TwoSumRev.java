package days90.day03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumRev {

    public static void main(String[] args) {
        int [] nums = {3,2,4};
        int target = 5;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int c= target- nums[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
