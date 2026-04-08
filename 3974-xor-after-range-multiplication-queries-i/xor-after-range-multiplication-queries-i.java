class Solution {
    public int xorAfterQueries(int[] nums, int[][] q) {
        int k=0;
        int l=0;
        int m=0;
        int n=0;
        for(int i=0;i<q.length;i++){
             k=q[i][0];
             l=q[i][1];
             m=q[i][2];
             n=q[i][3];
             int idx=k;
             while(idx<=l){
                nums[idx] =(int)(((long)nums[idx] * n) % (1000000000+7));
                idx=idx+m;
             }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}