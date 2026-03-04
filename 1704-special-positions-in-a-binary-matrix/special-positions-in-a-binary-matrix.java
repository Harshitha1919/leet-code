class Solution {
    public int numSpecial(int[][] mat) {
        int ans=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                   if(mat[i][j]==1){
                      int col=0;
                      int row=0;
                      for(int k=0;k<mat[0].length;k++){
                           if(mat[i][k]==1){
                            col++;
                           }
                      }
                       for(int k=0;k<mat.length;k++){
                           if(mat[k][j]==1){
                            row++;
                           }
                      }
                    
                   
            
           

          if(col==1 && row==1)
            ans++;
        }
            }
        }
        return ans;
    }
}