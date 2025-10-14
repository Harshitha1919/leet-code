class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int size=0;
        for(int i=0;i+2*k<=nums.size();i++){
            int j=i;
            size=0;
           while(size<k-1 ){
            if(nums.get(j)>=nums.get(j+1)){
                break;
            }
            if(nums.get(j+k)>=nums.get(j+k+1)){
                break;
            }
            j++;
            size++;
           }
        
        if(size==k-1){
            return true;
        }
    }
        return false;
    }
}