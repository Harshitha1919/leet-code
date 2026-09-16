class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int l=0;
        int r=0;
        if(nums.length<3){
            return 0;
        }
        int diff=nums[1]-nums[0];
        int ans=0;

        for(r=0;r<nums.length-1;r++){
            if(nums[r+1]-nums[r]!=diff){
               
                int n=r-l+1;
                if(n>=3){
              int  sum=((n-1)*(n-2))/2;
                ans=sum+ans;
                }
                l=r;
                diff=nums[r+1]-nums[r];
                
            }
        }

         int n = nums.length - l;
        if (n >= 3) {
            ans += ((n - 1) * (n - 2)) / 2;
        }
        return ans;
    }
}