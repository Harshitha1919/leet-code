class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        for(int k:hs.keySet()){
            if(hs.get(k)==1){
                return -1;
            }
            else if(hs.get(k)%3==0){
                ans+=hs.get(k)/3;
            }
            else if(hs.get(k)%3!=0){
                ans+=(hs.get(k)/3)+1;
            }
           
           
        }
        
        return ans;
    }
}