class Solution {
    public int subarraySum(int[] nums, int k) {
        
    int count=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        int prefix=0;
        hs.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefix=prefix+nums[i];
            if(hs.containsKey(prefix-k)){
                count=count+hs.get(prefix-k);
            }
            hs.put(prefix,hs.getOrDefault(prefix,0)+1);
        }
        return count;

    }
}