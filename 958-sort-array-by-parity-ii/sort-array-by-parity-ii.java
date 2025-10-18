class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int a[] =new int[nums.length];
        int j=0;
        int k=0;
        int h=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
               
               a[k]=nums[i];
               k=k+2; 
               
                
                
            }
            else{
                
                a[h]=nums[i];
                h=h+2;
               
               
               
            }
            
        }
        return a;
    }
}