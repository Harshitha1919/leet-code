class Solution {
    public int minMoves2(int[] nums) {
        int mid=nums.length/2;
        int ans=0;
        Arrays.sort(nums);
        for(int i=0;i<=mid;i++){
            ans=ans+(nums[mid]-nums[i]);
           
        }

        for(int i=mid+1;i<nums.length;i++){
           
           ans=ans+(nums[i]-nums[mid]);
        }
        return ans;
    }
}