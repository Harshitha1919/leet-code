class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int bitwise=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                bitwise=nums[i] | bitwise;
            }
        }
        return bitwise;
    }
}