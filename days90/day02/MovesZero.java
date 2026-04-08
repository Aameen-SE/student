package days90.day02;

import java.util.Arrays;

public class MovesZero {
    public static void main(String[] args) {
        //Input: nums = [0,1,0,3,12]
        //Output: [1,3,12,0,0]

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums){
        int insertPos =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertPos]=nums[i];
                insertPos++;
            }
        }

        while (insertPos< nums.length){
            nums[insertPos]=0;
            insertPos++;
        }

    }


}
