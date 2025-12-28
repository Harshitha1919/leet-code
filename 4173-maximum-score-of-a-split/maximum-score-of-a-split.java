import java.util.*;

class Solution {
    public long maximumScore(int[] nums) {

        long sum = 0;
        long maxvalid = Long.MIN_VALUE;

        int suffix[]=new int[nums.length];
        suffix[nums.length-1]=nums[nums.length-1];
      for(int i=nums.length-2;i>=0;i--){
         suffix[i]=Math.min(nums[i],suffix[i+1]);
      } 
      
        for (int i = 0; i < nums.length-1 ; i++) {

            sum += nums[i];

            long score = sum - suffix[i+1];
            maxvalid = Math.max(maxvalid, score);

           
        }

        return maxvalid;
    }
}
