class Solution {
    public int firstStableIndex(int[] nums, int ki) {
        for(int i = 0; i < nums.length; i++) {

            int max = Integer.MIN_VALUE;
            for(int j = 0; j <= i; j++){
                max = Math.max(max, nums[j]);
            }

            int min = Integer.MAX_VALUE;
            for(int k = i ; k < nums.length; k++){
                min = Math.min(min, nums[k]);
            }

            if((max - min) <= ki){
                return i;   // first valid index
            }
        }
        return -1;
    }
}