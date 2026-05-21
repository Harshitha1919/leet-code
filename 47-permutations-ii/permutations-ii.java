class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();

        // Sort first
        Arrays.sort(nums);

        int[] original = nums.clone();

        while (true) {

            // Add current permutation
            List<Integer> temp = new ArrayList<>();

            for (int num : nums) {
                temp.add(num);
            }

            ans.add(temp);

            // Generate next permutation
            nextPermutation(nums);

            // Stop if returned to original
            if (Arrays.equals(nums, original)) {
                break;
            }
        }

        return ans;
    }

    public void nextPermutation(int[] nums) {

        int in = -1;

        // Find breakpoint
        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < nums[i + 1]) {
                in = i;
                break;
            }
        }

        // If completely decreasing
        if (in == -1) {

            reverse(nums, 0, nums.length - 1);
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

        // Reverse suffix
        reverse(nums, in + 1, nums.length - 1);
    }

    public void reverse(int[] nums, int left, int right) {

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
    
