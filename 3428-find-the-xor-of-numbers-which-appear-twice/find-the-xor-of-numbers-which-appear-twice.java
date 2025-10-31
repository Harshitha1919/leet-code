class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                ans=ans^nums[i];
            }
            else{
                hs.add(nums[i]);
            }
        }
        return ans;
    }
}