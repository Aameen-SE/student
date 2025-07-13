package dailypractice.july12;

public class Test {

        public static void rotate(int[] nums, int k) {
            int n = nums.length;
            int[] temp = new int[n];
            k = k % n; // handle if k > n

            // Move each element to its new position
            for (int i = 0; i < n; i++) {
                int newIndex = (i + k) % n;
                temp[newIndex] = nums[i];
            }

            // Copy back to original array
            for (int i = 0; i < n; i++) {
                nums[i] = temp[i];
            }
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;

            rotate(nums, k);

            for (int num : nums) {
                System.out.print(num + " ");
            }
        }
    }


