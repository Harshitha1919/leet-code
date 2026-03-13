class Solution {
    public void setZeroes(int[][] matrix) {
       int ans[][]=new int[matrix.length][matrix[0].length];
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[i][j] = matrix[i][j];
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                   for(int k=0;k<matrix.length;k++){
                      ans[k][j]=0;
                   }
                    for(int l=0;l<matrix[0].length;l++){
                      ans[i][l]=0;
                   }
                }
               
            }
        }
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = ans[i][j];
            }
        }
        
    }
}