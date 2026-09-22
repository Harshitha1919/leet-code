class Solution {
    public void solve(int [] nums,List<List<Integer>> ls,int start,int n){
        if(start==n){
            List<Integer> arr=new ArrayList<>();
           for(int i=0;i<n;i++){
                 arr.add(nums[i]);
           }
           ls.add(new ArrayList<>(arr));
           return;
        }
        for(int i=start;i<n;i++){
              swap(i,start,nums);
              solve(nums,ls,start+1,n);
              swap(i,start,nums);
        }
    }
    public void swap(int i,int start,int[] nums){
        int t=nums[i];
        nums[i]=nums[start];
        nums[start]=t;
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ls=new ArrayList<>();
         solve(nums,ls,0,nums.length);
            return ls;
    }
}