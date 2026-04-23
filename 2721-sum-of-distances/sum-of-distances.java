import java.util.*;

class Solution {
    public long[] distance(int[] nums) {

        HashMap<Integer, ArrayList<Integer>> hs = new HashMap<>();

        // grouping indices
        for (int i = 0; i < nums.length; i++) {
            if (!hs.containsKey(nums[i])) {
                hs.put(nums[i], new ArrayList<>());
            }
            hs.get(nums[i]).add(i);
        }

        long[] arr = new long[nums.length]; // ✅ FIX ADDED

        // processing each group
        for (ArrayList<Integer> list : hs.values()) {
            int k = list.size();

            if (k == 1) {
                arr[list.get(0)] = 0;
                continue;
            }

            long totalSum = 0;
            for (int idx : list) {
                totalSum += idx;
            }

            long prefixSum = 0;

            for (int p = 0; p < k; p++) {
                int x = list.get(p);

                long left = (long) x * p - prefixSum;
                long right = (totalSum - prefixSum - x) - (long) x * (k - p - 1);

                arr[x] = left + right;

                prefixSum += x;
            }
        }

        return arr;
    }
}