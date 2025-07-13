package dailypractice.july12;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] reverse = new int[nums.length];

        int j=0;

        for(int i=nums.length-1;i>=0;i++){
            reverse[j]=nums[i];
            j++;
        }

        System.out.println(Arrays.toString(reverse));

    }
}
