class Solution {
    public int pivotIndex(int[] nums) {
      

        for(int i=0;i<nums.length;i++){
           int j=0;
           int k=i;
             int sum=0, sum1=0;
            while(j<=i ){
                sum=sum+nums[j];
               j++;
            }
             while(k<nums.length ){
                sum1=sum1+nums[k];
                k++;
              
            }
            if(sum==sum1){
                return i;
            }
        }
            
        return -1;
    }
}