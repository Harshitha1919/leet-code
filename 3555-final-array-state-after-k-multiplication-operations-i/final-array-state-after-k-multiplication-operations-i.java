class Solution {

    private int minIndex(int[] nums) {
        int index = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[index]) {
                index = i;
            }
        }
        
        return index;
    }

    public int[] getFinalState(int[] nums, int k, int m) {

        while (k > 0) {
            int index = minIndex(nums);
            nums[index] = nums[index] * m;
            k--;
        }

        return nums;
    }
}