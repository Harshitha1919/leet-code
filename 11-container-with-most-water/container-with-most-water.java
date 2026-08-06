class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int ans=0;
        int area=0;
        int right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                 area=height[left]*(right-left);
                 ans=Math.max(area,ans);
                 left++;

            }
            else{
                  area=height[right]*(right-left);
                 ans=Math.max(area,ans);
                 right--;

            }
        }
        return ans;
    }
}