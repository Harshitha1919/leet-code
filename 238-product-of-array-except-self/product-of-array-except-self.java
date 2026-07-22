class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            mul=mul*nums[i];
            }
            else{
                ans++;
            }
        }
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && ans==1)
            a[i]=mul;
            else if(nums[i]==0 && ans>1){
                a[i]=0;
            }
            else if(ans==0){
                a[i]=mul/nums[i];
            }
            else if(ans==1){
                a[i]=0;
            }
        }
        return a;
    }
}