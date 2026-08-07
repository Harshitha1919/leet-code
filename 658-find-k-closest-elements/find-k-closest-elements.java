class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
         Integer[] arr = new Integer[nums.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }
    
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],Math.abs(x-arr[i]));
        }
        Arrays.sort(arr,(a,b)->{
             if(!hs.get(a).equals(hs.get(b))){
                 return hs.get(a)-hs.get(b);
             }
             return a-b;
        });
         ArrayList<Integer> ans=new ArrayList<>();
         for(int i=0;i<k;i++){
            ans.add(arr[i]);
         }
      Collections.sort(ans);

        return ans;

    }
}