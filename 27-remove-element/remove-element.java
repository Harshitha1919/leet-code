class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<=j){
            if(nums[i]==val){
                nums[i]=nums[j];
                nums[j]=0;
                count++;
                j--;
            }
            else{
                i++;
            }
        }
        return nums.length-count;
    }
}