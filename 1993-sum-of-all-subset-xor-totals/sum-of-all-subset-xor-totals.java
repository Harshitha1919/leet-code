class Solution {
    int sum=0;
    private void subset(int i,int [] nums,List<Integer> arr){
        if(i==nums.length){
            int ans=0;
             for(int j=0;j<arr.size();j++){
                ans=ans^arr.get(j);
             }
             sum=sum+ans;
         return ;
        }
        arr.add(nums[i]);
        subset(i+1,nums,arr);
        arr.remove(arr.size()-1);
        subset(i+1,nums,arr);
      
    }
    public int subsetXORSum(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
       subset(0,nums,arr);

 return sum;
    }
}