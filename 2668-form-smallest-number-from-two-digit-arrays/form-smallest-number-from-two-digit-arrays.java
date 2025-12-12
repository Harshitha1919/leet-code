class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
       
        HashSet<Integer> hs1=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
         for(int i=0;i<nums2.length;i++){
            hs1.add(nums2[i]);
        }
       
    
        for(int i=0;i<nums1.length;i++){
           if(hs1.contains(nums1[i])){
            return nums1[i];
           }
        }
       
        
       
        int h=nums1[0];
        int l=nums2[0];
        int ans=0;
        if(h<l){
         ans=h*10+l;
        }
        else{
         ans=l*10+h;
        }
        return ans;
    }
}