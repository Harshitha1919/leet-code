class Solution {
    public int pivotInteger(int n) {
        int j=1;
        if(n==1){
            return 1;
        }
         while(j!=n){

           int x=0;
           j++;
           int sum=0;
           int sum1=0;
        for(int i=1;i<=n;i++){
            
                if(j>=i){
                    sum=sum+i;
                    x=i;
                }
                else{
                    sum1=sum1+i;
                }
                
        }
        if(sum==(sum1+x)){
            return x;
        }

    }
    return -1;
    }
}