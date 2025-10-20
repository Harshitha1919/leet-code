class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int k;
        int temp=0;
        for(int i=1;i<nums.length;i=i+2){
            
            for(int j=1;j+2<nums.length;j=j+2){
                if(nums[j]<nums[j+2]){
                temp=nums[j];
                nums[j]=nums[j+2];
                nums[j+2]=temp;
            }
        }
        }
        
        
        for(int i=0;i<nums.length;i=i+2){ 
            for( k=0;k+2<nums.length;k=k+2){
                if(nums[k]>nums[k+2]){
                 temp=nums[k];
                nums[k]=nums[k+2];
                nums[k+2]=temp;
                }
            }
          
        }
        
        return nums;
    }
}