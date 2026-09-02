class Solution {
            int sum=0;
            int xor=0;
    public void sum(int [] nums,int start){
        if(start==nums.length){
            return ;
        }
       for(int i=start;i<nums.length;i++){
        xor=xor^nums[i];
           sum=sum+xor;
           sum(nums,i+1);
           xor=xor^nums[i];
       }
    }
    public int subsetXORSum(int[] nums) {
        sum(nums,0);
            return sum;
    }

}