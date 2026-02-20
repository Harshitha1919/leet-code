class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int max1=0;
        int count=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                count++;
            }
            while(count>=2){
                if(nums[l]==0){
                    count--;
                }
                l++;
            }
            max1=Math.max(max1,r-l+1);
             
        }
        return max1-1;
    }
}