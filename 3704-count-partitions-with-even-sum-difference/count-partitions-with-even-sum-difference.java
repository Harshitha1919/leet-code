class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int totalsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum=totalsum+nums[i];
        }
        for(int i=1;i<nums.length;i++){
            int sum=0;
            int sum2=0;
            for(int j=0;j<i;j++){
                  sum=sum+nums[j];
            }
            sum2=totalsum-sum;
            if((sum2-sum)%2==0){
                count++;
            }
        }
        return count;
    }
}