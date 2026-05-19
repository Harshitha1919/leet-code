class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer,Integer> hs = new HashMap<>();
        int ans = nums.length;

        for(int i = 0; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }

        int maxFreq = 0;

        for(int n : hs.keySet()) {
            maxFreq = Math.max(maxFreq, hs.get(n));
        }

        for(int n : hs.keySet()) {

            if(hs.get(n) == maxFreq) {

                int start = -1;
                int end = -1;

                for(int i = 0; i < nums.length; i++) {

                    if(nums[i] == n && start == -1) {
                        start = i;
                    }

                    if(nums[i] == n) {
                        end = i;
                    }
                }

                ans = Math.min(ans, end - start + 1);
            }
        }

        return ans;
    }
}