class Solution {
    public int[] sortedSquares(int[] nums) {
        int []sort=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sort[i]=nums[i]*nums[i];
        }
        Arrays.sort(sort);
        return sort;
    }
}