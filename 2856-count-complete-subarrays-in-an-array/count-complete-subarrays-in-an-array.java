class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
      
        int c=0;
       
        for(int l=0;l<nums.length;l++){
             HashMap<Integer,Integer> hs1=new HashMap<>();
        for(int r=l;r<nums.length;r++){
            hs1.put(nums[r],hs1.getOrDefault(nums[r],0)+1);
            if(hs.size()==hs1.size()){
                c++;
            }
        }
        }
        return c;

    }
}