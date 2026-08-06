class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      
        Set<List<Integer>> ans=new HashSet<>();
        for(int i=0;i<nums.length;i++){
                HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                    int k=nums[i]+nums[j];
                    if(hs.contains((-k))){
                      List<Integer> arr=new ArrayList<>();
                      arr.add(nums[i]);
                      arr.add(nums[j]);
                      arr.add(-k);
                      Collections.sort(arr);
                 
                       ans.add(arr);
                    }
                    else{
                        hs.add(nums[j]);
                    }
            }
          
           
        }
        return new ArrayList<>(ans);
    }
}