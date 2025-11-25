package dailypractice.nov.nov25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
       int ans[]= twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer ,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c=target-nums[i];

            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
