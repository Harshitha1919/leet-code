class Solution {
    public int hammingDistance(int a, int b) {
        int c=0;
        while(a>0 || b>0){
            int b1=a&1;
            int b2=b&1;
            if(b1!=b2){
               c++;
            }
            a=a>>1;
            b=b>>1;
        }
        return c;
    }
}