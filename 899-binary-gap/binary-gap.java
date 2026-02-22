class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int max1=0;
        int index=0;
        int once=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1' && once==0){
                once=1;
                index=i;
            }
           else if(s.charAt(i)=='1' && once==1){
                max1=Math.max(max1,i-index);
                index=i;
            }
        }
        return max1;
    }
}