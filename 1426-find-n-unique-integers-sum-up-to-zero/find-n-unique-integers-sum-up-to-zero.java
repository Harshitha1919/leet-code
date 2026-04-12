class Solution {
    public int[] sumZero(int n) {
             int ans[]=new int[n];
        if(n==2){
            ans[0]=-1;
            ans[1]=1;
            return ans;

        }
   
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+i;
             ans[i]=i;
        }
        ans[n-1]=-sum;
        return ans;
    }
}