class Solution {
    public int[] runningSum(int[] nums) {
        int acc[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            acc[i]=sum+nums[i];
            sum=sum+nums[i];
        }
        return acc;
    }
}