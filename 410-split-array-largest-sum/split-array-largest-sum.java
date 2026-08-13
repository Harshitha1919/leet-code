class Solution {
    public int solution(int [] nums,int k,int mid){
        int count=1;
        int sumsol=0;
        int ans1=-1;
           for(int i=0;i<nums.length;i++){
                 if(sumsol+nums[i]>mid){
                    count++;
                    
                    sumsol=nums[i];
                 }
                 else{
                    sumsol=sumsol+nums[i];
                 }
           }
           if(count<=k){
            return 1;
           }
           return -1;
    }
    public int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;
       
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
             sum=sum+nums[i];
        }
        
        int low=max;
        int final1=0;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            int ans=solution(nums,k,mid);
            if(ans==-1){
               low=mid+1;
            }
            else{
               final1=mid;
                high=mid-1;
            }
        }
       return final1;
    }
}