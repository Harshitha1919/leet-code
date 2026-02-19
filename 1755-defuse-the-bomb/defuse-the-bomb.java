class Solution {
    public int[] decrypt(int[] code, int k) {
        int ans[]=new int[code.length];
        int n=code.length;
        for(int i=0;i<code.length;i++){
            int sum=0;
            if(k>0){
                int h=0;
                int j=i+1;
              while(h<k){
            
                sum += code[j % n];
                j++;
               
                h++;
              }
              ans[i]=sum;
            }
           else if(k<0){
                int h=0;
                int j=i-1;
              while(h<-k){
               sum += code[(j + n) % n];
               
                j--;
                h++;
               
              }
              ans[i]=sum;
            }
            else{
                ans[i]=0;
            }

        }
        return ans;
    }
}