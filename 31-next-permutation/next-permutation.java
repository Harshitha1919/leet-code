class Solution {

    public void nextPermutation(int[] nums) {

        int in = -1;

        // Find breakpoint
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                in = i;
                break;
            }
        }

        // If array is completely decreasing
        if (in == -1) {

            int left = 0;
            int right = nums.length - 1;

            while (left < right) {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }

            return;
        }

        // Find rightmost greater element
        int in2 = -1;

        for (int i = nums.length - 1; i > in; i--) {

            if (nums[i] > nums[in]) {
                in2 = i;
                break;
            }
        }

        // Swap
        int temp = nums[in];
        nums[in] = nums[in2];
        nums[in2] = temp;

        // Reverse remaining part
        int left = in + 1;
        int right = nums.length - 1;

        while (left < right) {

            int temp2 = nums[left];
            nums[left] = nums[right];
            nums[right] = temp2;

            left++;
            right--;
        }
    }
}