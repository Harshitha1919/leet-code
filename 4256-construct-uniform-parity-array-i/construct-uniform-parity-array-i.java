class Solution {
    public boolean uniformArray(int[] nums1) {
        int c=0;
        int c1=0;
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]%2==0){
                c++;
            }
            else{
                c1++;
            }
        }
        if( c1>=1 || c>=1 || c1==0 || c==0 ){
            return true;
        }
        return false;
    }
}