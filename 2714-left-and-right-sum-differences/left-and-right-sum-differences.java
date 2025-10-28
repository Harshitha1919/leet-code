class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftsum = new int[n];
        int[] rightsum = new int[n];
        leftsum[0]=0;
        int sum=0;
        for(int i=1;i<nums.length;i++){
            leftsum[i]=leftsum[i-1]+nums[i-1];
        }
        rightsum[nums.length-1]=0;
       for (int i = n - 2; i >= 0; i--) {
            rightsum[i] = rightsum[i + 1] + nums[i + 1];
        }
        int min[]=new int[n];
        for (int i = 0; i < n; i++) {
            min[i] = Math.abs(leftsum[i] - rightsum[i]);
        }
        return min;
    }
}