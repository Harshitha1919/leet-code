import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;

        // Fix the largest side at index j
        for (int j = n - 1; j >= 2; j--) {
            int i = 0, k = j - 1;
            while (i < k) {
                if (nums[i] + nums[k] > nums[j]) {
                    // All values from i..k-1 with nums[k] and nums[j] are valid
                    count += (k - i);
                    k--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}
