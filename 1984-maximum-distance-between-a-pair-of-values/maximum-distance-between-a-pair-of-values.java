class Solution {
    private int mid(int n1,int[] nums2){
          int low=0;
          int ans=0;
           int high=nums2.length-1;
            while(low<=high){
           int mid=(low+high)/2;
            if(nums2[mid]>=n1){
                 ans=mid;
                 low=mid+1;
            }
            else{
                high=mid-1;
            }
        
           }
           return ans;
    }
    public int maxDistance(int[] nums1, int[] nums2) {
        int result=0;
        for(int i=0;i<nums1.length;i++){
            int ans2=mid(nums1[i],nums2);
            result=Math.max(result,ans2-i);
        }
        return result;
    }
}