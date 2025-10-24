class Solution {
    public int findMiddleIndex(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int sum=0;
            int sum1=0;
           for(int j=0;j<=i;j++){
               sum=sum+nums[j];
           }
           for(int k=i;k<nums.length;k++){
            sum1=sum1+nums[k];
           }
           if(sum==sum1){
            return i;
           }
        }
        return -1;
    }
}