class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int max1=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0 && nums[i]<=threshold){
                int l=i;
                int len=1;
                while(l+1<nums.length && nums[l+1]<=threshold && nums[l]%2!=nums[l+1]%2){
                    
                    l++;
                    len++;
                }
                  max1=Math.max(max1,len);

            }
          
         }
         return max1;
    }
}