class Solution {
    List<Integer> arr=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    public void solve(int[] nums,int start){
       if(start==nums.length){
        return ;
       }
       for(int i=start;i<nums.length;i++){
       
        if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            arr.add(nums[i]);
            ans.add(new ArrayList<>(arr));
        
        solve(nums,i+1);
        arr.remove(arr.size()-1);
       }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans.add(new ArrayList<>());
        Arrays.sort(nums);
        solve(nums,0);
        return ans;
    }
}