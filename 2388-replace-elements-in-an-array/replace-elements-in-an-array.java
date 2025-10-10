class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],i);
        }
     for(int i=0;i<operations.length;i++){
           int index=hs.get(operations[i][0]);
        
         
              nums[index]  =operations[i][1];
             hs.remove(operations[i][0]);
             hs.put(operations[i][1],index);
        
            
     }  
      return nums; 
    }
}