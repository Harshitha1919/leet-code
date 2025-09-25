class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        if(nums.length==1){
            return nums[0];
        }
        double max1=Integer.MIN_VALUE;
        double sum=0;
        for(int r=0;r<nums.length;r++){
            sum=sum+nums[r];
            if((r-l+1)==k){
                max1=Math.max(max1,(sum)/k);
                sum=sum-nums[l];
                l++;
            }

        }
        return max1;
    }
}