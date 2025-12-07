class Solution {
    public int[] finalPrices(int[] prices) {
        int k=0;
        int a[]=new int[prices.length];
        for(int i=0;i<prices.length;i++){
           int flag=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>=prices[j]){
                    flag=1;
                    a[k]=prices[i]-prices[j];
                    k++;
                    break;
                }
            }
            if(flag==0){
                a[k]=prices[i];
                k++;
            }
        }
        return a;
    }
}