class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max1=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
             max1= Math.max(hs.get(nums[i]),max1);
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hs.get(nums[i])==max1){
                count++;
            }
        }
        return count;
    }
}