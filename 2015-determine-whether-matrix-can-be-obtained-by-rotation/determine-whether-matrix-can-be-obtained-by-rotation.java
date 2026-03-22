class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int ans[][]=new int[mat.length][mat.length];
      
        int n=mat.length;
        int t=0;
         
        while(t<4){
             int k=0;
    for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                ans[j][n-i-1]=mat[i][j];
            
            }
        }
           for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(ans[i][j]!=target[i][j]){
                    k=1;
                  break;
                }
            }
        }
        if(k==0){
            return true;

        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
               mat[i][j]=ans[i][j];
            }
        }
        t++;
        }
        return false;
        
        
    }
}