class Solution {
    public int dominantIndices(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int c=0;
        
        for(int i=0;i<nums.length;i++){
            sum=sum-nums[i];
            double avg=(double)sum/(nums.length-i-1);
            if(nums[i]>avg){
                c++;
            }
        }
        return c;
    }
}