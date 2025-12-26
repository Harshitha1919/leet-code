import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        // Step 1: sort a copy of the array
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        // Step 2: store frequency of top k elements
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = sorted.length - 1; i >= sorted.length - k; i--) {
            map.put(sorted[i], map.getOrDefault(sorted[i], 0) + 1);
        }

        // Step 3: build result using original order
        int[] result = new int[k];
        int idx = 0;

        for (int num : nums) {
            if (map.getOrDefault(num, 0) > 0) {
                result[idx++] = num;
                map.put(num, map.get(num) - 1);
            }
        }

        return result;
    }
}
