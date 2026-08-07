class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int min1=Integer.MAX_VALUE;
        for( right=0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>=target){
                min1=Math.min(right-left+1,min1);
                sum=sum-nums[left];
                left++;

            }

        }
        if(min1==Integer.MAX_VALUE){
            return 0;
        }
        return min1;
    }
}