class Solution {
    public int dominantIndex(int[] nums) {
        int last=0;
        for(int i=0;i<nums.length;i++){
           last= Math.max(last,nums[i]);
        }
        int n=nums.length;
        int index=0;
        
        for(int i=0;i<nums.length;i++){
            if(last==nums[i]){
                index=i;
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=last && nums[i]*2>last   && nums[i]!=0 ){
                return -1;
            }
        }
        return index;
    }
}