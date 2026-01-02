class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> hs =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        int k=0;
        for(int num:nums){
            if(hs.get(num)==(nums.length/2)){
                 k=num;
                break;
            }
        }
        return k;
    }
}