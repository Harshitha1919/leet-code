class Solution {
    public void rotate(int[][] matrix) {
        int arr [][]=new int[matrix.length][matrix.length];
        int k=0;
        for(int i=matrix.length-1;i>=0;i--){
            for(int j=0;j<matrix.length;j++){
                  arr[j][i]=matrix[k][j];
            }
            k++;
        }
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                  matrix[i][j]=arr[i][j];
            }
        }
        
    }
}