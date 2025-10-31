class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
             if(!hs.contains(nums[i])){
                hs.add(nums[i]);
             }
             else{
                arr.add(nums[i]);
             }
       }  
    //    int[] ans=new int[arr.size()];
    //    for(int i=0;i<arr.size();i++){
    //     ans[i]=arr.get(i);
    //    }
       return arr;
    }
}