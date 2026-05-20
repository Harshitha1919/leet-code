class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int j=1;
        while(top<=bottom && left<=right){
            for(int i=left ;i<=right;i++){
                matrix[top][i]=j;
                j++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                matrix[i][right]=j;
                j++;
            }
            right--;;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=j;
                    j++;
                }
            bottom--;
            }
            if(left<=right){
               for(int i=bottom;i>=top;i--){
                    matrix[i][left]=j;
                    j++;
                } 
                left++; 
            }
        }
        return matrix;
    }
}