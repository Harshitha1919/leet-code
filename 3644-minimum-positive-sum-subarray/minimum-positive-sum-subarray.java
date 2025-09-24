class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;
        
        // Prefix sum array
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        // Check all subarrays of length l to r
        for (int i = 0; i < n; i++) {
            for (int len = l; len <= r && i + len <= n; len++) {
                int sum = prefix[i + len] - prefix[i];
                if (sum > 0) { // ✅ Only consider positive sums
                    minSum = Math.min(minSum, sum);
                }
            }
        }

        return (minSum == Integer.MAX_VALUE ? -1 : minSum);
    }
}
