class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Try every index that has value 0
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                // Try both directions: left (-1) and right (+1)
                if (canMakeAllZero(nums, i, 1)) count++;
                if (canMakeAllZero(nums, i, -1)) count++;
            }
        }

        return count;
    }

    // Helper function to simulate the process
    private boolean canMakeAllZero(int[] nums, int start, int dir) {
        int n = nums.length;
        int[] arr = nums.clone(); // Make a copy (don’t change original)
        int curr = start;

        while (curr >= 0 && curr < n) {
            if (arr[curr] == 0) {
                // Just move in same direction
                curr += dir;
            } else {
                // Decrease by 1, reverse direction, and move
                arr[curr]--;
                dir = -dir; // reverse direction
                curr += dir;
            }
        }

        // Check if all elements are zero
        for (int x : arr) {
            if (x != 0) return false;
        }
        return true;
    }
}
