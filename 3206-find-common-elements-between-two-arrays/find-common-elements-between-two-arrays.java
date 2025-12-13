class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
            HashSet<Integer> hs2=new HashSet<>();

       
        for(int i=0;i<nums1.length;i++){
         hs.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++){
         hs2.add(nums2[i]);
        }
        int count=0;
        int count1=0;
        
        for(int i=0;i<nums1.length;i++){
            if(hs2.contains(nums1[i])){
                count++;
            }
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                count1++;
            }
        }
       int k[]=new int[2];
       k[0]=count;
       k[1]=count1;
       
        return k;
    }
}