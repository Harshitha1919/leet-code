import java.util.*;

class Solution {
    int sum = 0;

    private void subset(int i, int[] nums, List<Integer> arr) {
        if (i == nums.length) {
            int ans = 0;
            for (int j = 0; j < arr.size(); j++) {
                ans = ans ^ arr.get(j);
            }
            sum += ans;
            return;  // ✅ VERY IMPORTANT
        }

        // pick
        arr.add(nums[i]);
        subset(i + 1, nums, arr);

        // not pick
        arr.remove(arr.size() - 1);
        subset(i + 1, nums, arr);
    }

    public int subsetXORSum(int[] nums) {
        subset(0, nums, new ArrayList<>());
        return sum;
    }
}