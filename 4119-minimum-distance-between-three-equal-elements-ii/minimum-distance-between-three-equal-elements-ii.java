class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer,List<Integer>> hs=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.containsKey(nums[i])){
                hs.put(nums[i],new ArrayList<>());
                hs.get(nums[i]).add(i);
            }
            else{
                hs.get(nums[i]).add(i);
            }
        }
        int min=Integer.MAX_VALUE;
        for(int key:hs.keySet()){
            List<Integer> arr=hs.get(key);
            if(arr.size()>=3){
            for(int i=0;i<arr.size()-2;i++){
                    int a = arr.get(i);
                    int b = arr.get(i + 1);
                    int c = arr.get(i + 2);

                    int ans = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                    min = Math.min(min, ans);
            }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}