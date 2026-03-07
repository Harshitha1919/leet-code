class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
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
        Collections.sort(arr);
        int x=0;
        int y=0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
            if(hs.get(arr.get(i))!=hs.get(arr.get(j))){
                x=arr.get(i);
                y=arr.get(j);
                return new int[]{x,y};
            }
            }
        }
       
        
         return new int[]{-1,-1};
        

    }
}