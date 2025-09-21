class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;

        for (int num : nums) {
            max1 = Math.max(max1, num);
            min1 = Math.min(min1, num);
        }

        long ans = (long)(max1 - min1) * k; // cast to long
        return ans;
    }
}
