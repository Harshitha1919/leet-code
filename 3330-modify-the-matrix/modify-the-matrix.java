class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int max1;
        int ans[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix[0].length;i++){
            max1=Integer.MIN_VALUE;
            int flag=0;
            int k=0;
            int h=0;
            for(int j=0;j<matrix.length;j++){
                
                ans[j][i]=matrix[j][i];
                max1=Math.max(matrix[j][i],max1);
            }
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]==-1){
                    ans[j][i]=max1;
                }
            }
            
        }
        return ans;
    }
}