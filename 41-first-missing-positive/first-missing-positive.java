class Solution {
    public int firstMissingPositive(int[] nums) {
        int k=1;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                hs.add(nums[i]);
            }
        }

        while(true){
            if(!hs.contains(k)){
                return k;
            }
            k++;
        }
        
    }
}