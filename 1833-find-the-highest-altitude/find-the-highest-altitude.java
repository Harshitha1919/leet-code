class Solution {
    public int largestAltitude(int[] gain) {
        int sum[]=new int[gain.length+1];
          
        for(int i=1;i<=gain.length;i++){
            sum[i]=sum[i-1]+gain[i-1];
        }
       int min1 =0;
        for(int i=0;i<sum.length;i++){
            if(min1<sum[i]){
                min1=sum[i];
            }
        }
        return min1;
    }
}