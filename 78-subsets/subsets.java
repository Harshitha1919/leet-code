class Solution {
    List<Integer> ans=new ArrayList<>();
    List<List<Integer>> arr=new ArrayList<>();
    public void solve(int[] nums,int start,List<List<Integer>> arr){
        if(start==nums.length){
            return;
        }
        for(int i=start;i<nums.length;i++){
            ans.add(nums[i]);
            arr.add(new ArrayList<>(ans));
            solve(nums,i+1,arr);
            ans.remove(ans.size()-1);



        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        arr.add(new ArrayList<>());
        solve(nums,0,arr);
        
        return arr;
    }
}