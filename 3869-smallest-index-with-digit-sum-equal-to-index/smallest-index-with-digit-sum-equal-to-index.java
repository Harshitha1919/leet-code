class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int rem=0;
            while(n>0){
                 rem=n%10+rem;
                n=n/10;
            }
            if(rem==i){
                return i;
            }

        }
        return -1;
    }
}