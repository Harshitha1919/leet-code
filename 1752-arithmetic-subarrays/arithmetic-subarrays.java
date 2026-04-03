import java.util.*;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {

            // Step 1: Extract subarray
            int start = l[i];
            int end = r[i];

            int[] temp = new int[end - start + 1];
            int idx = 0;

            for (int j = start; j <= end; j++) {
                temp[idx++] = nums[j];
            }

            // Step 2: Sort
            Arrays.sort(temp);

            // Step 3: Check arithmetic
            boolean isArithmetic = true;
            int diff = temp[1] - temp[0];

            for (int k = 2; k < temp.length; k++) {
                if (temp[k] - temp[k - 1] != diff) {
                    isArithmetic = false;
                    break;
                }
            }

            ans.add(isArithmetic);
        }

        return ans;
    }
}