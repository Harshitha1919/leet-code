class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[][] ans = new int[m][n];

        // copy matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = matrix[i][j];
            }
        }

        // process zeros
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){

                    for(int k=0;k<m;k++){
                        ans[k][j]=0;
                    }

                    for(int l=0;l<n;l++){
                        ans[i][l]=0;
                    }
                }
            }
        }

        // copy back
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = ans[i][j];
            }
        }
    }
}