class Solution {
    public boolean isGood(int[] nums) {
        int max=0;
        int n=nums.length;
      for(int i=0;i<nums.length;i++){
           if(nums[i]>max){
            max=nums[i];
           }
      }
      int base[]=new int[max+1];
      if(max==1){
        base[0]=1;
        base[1]=1;
      } 
     
       
      if(max>=2){
        
        for(int i=0;i<max-1;i++){
             base[i]=i+1;
        }
        base[max-1]=max;
        base[max]=max;
      } 
      if(base.length!=nums.length){
        return false;
      }
      Arrays.sort(base);
      Arrays.sort(nums);
      if(Arrays.equals(base,nums)){
        return true;
      }
      return false;
    }
}