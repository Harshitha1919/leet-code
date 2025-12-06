class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        // for(int i=0;i<nums1.length;i++){
        //     hs.put(nums1[i],hs.getOrDefault(nums1[i],0)+1);
        // }
        ArrayList<Integer> arr =new ArrayList<>();
          for(int i=0;i<nums2.length;i++){
            hs.put(nums2[i],hs.getOrDefault(nums2[i],0)+1);
        }
        for(int i=0;i<nums1.length;i++){
            if(hs.containsKey(nums1[i])){
                arr.add(nums1[i]);
                hs.put(nums1[i],hs.get(nums1[i])-1);
                if(hs.get(nums1[i])==0){
                    hs.remove(nums1[i]);
                }
            }
        }
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
             a[i]=arr.get(i);
        }
        return a;

    }
}