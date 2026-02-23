class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
       
        
        int min1=Integer.MAX_VALUE;

        for(int r=0;r<nums.length;r++){
            int x=0;
            for(int l=r;l<nums.length;l++){
                 x=x|nums[l];
            if(x>=k){
                min1=Math.min(min1,l-r+1);
                break;

               
            }
        }
        }
        if(min1==Integer.MAX_VALUE){
            return -1;
        }
        return min1;
    }
}