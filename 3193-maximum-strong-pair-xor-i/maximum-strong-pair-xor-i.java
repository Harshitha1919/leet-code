class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max1=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    int x=nums[i]^nums[j];
                    max1=Math.max(x,max1);
                }
            }
        }
        return max1;
    }
}