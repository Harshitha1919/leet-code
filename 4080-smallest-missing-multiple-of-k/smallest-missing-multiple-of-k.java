class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        Arrays.sort(nums);
        int j=1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            
           if(k*j==nums[i]){
              j++;
              int h=i;
            
           }
           else{
            count++;   
            if(count==nums.length){
                return k*j;
            }  
           }
        }
        return k*j;
    }
}