class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int ans=0;
        int min=Integer.MAX_VALUE;
    
        while(low<high){
            min=Math.min(height[low],height[high]);
            ans=Math.max(min*(high-low),ans);
            if(height[low]>height[high]){
                high--;
            }
            else{
                low++;
            }
        }
        return ans;

    }
}