class Solution {
    public int earliestFinishTime(int[] l, int[] la, int[] w, int[] wa) {
      int min1=Integer.MAX_VALUE;
        for(int i=0;i<l.length;i++){
             int ans=l[i]+la[i];
            for(int j=0;j<w.length;j++){
               
               int ans2=0;
               if(ans>w[j]){
                ans2=ans+wa[j];
               }
               else{
                 ans2=(w[j]-ans)+wa[j]+ans;
               }
               min1=Math.min(ans2,min1);
            }
        }

         for(int i=0;i<w.length;i++){
             int ans=w[i]+wa[i];
            for(int j=0;j<l.length;j++){
               
               int ans2=0;
               if(ans>l[j]){
                ans2=ans+la[j];
               }
               else{
                 ans2=l[j]-ans+la[j]+ans;
               }
               min1=Math.min(ans2,min1);
            }
        
         }
        return min1;
    }
}