class Solution {
    public int subsetXORSum(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<(1<<n);i++){
          
          int  ans=0;
            for(int j=0;j<nums.length;j++){
                if ((i & (1 << j)) != 0) {
                    ans=ans^nums[j];
                }
            }
            sum=sum+ans;
            
        }
        return sum;
    }
}