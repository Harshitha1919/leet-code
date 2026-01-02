class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> hs =new HashMap<>();
        int k=0;
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            if(hs.get(nums[i])>1){
                k=nums[i];
                break;
            }
            
        }
       
        return k;
    }
}