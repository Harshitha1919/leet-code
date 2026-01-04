class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int sum=0;
        int sum2=0;
        while(i<nums.length && j>=0 && k>0){
            
                sum=sum+nums[i];
                sum2=sum2+nums[j];
                i++;
                j--;
                k--;
        }
        int ans=Math.abs(sum-sum2);
        return ans;
    }
}