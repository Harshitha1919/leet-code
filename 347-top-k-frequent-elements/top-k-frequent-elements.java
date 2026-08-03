class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                    arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size()-i-1;j++){
                if(hs.get(arr.get(j))<hs.get(arr.get(j+1))){
                    int temp=arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1,temp);
                }
            }
        }
        int ans[]=new int[k];
        int l=0;
        
            for(int i=0;i<arr.size();i++){
                if(l<k){
                ans[l]=arr.get(i);
                l++;
                }
            }
      
        return ans;
    }
}