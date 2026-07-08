class Solution {
    public long sumAndMultiply(int n) {
        int k=n;
        long x=0;
        int sum=0;
        while(k>0){
            if((k%10)!=0){
            x=x*10+(k%10);
            sum=sum+(k%10);
            }

            k=k/10;
        }
        long rev=0;
        while(x>0){
            rev=rev*10+(x%10);
            x=x/10;
        }
        long ans=rev*sum;
        return ans;
    }
}