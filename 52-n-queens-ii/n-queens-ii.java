class Solution {
    int count=0;
    public void  solve(int n,int col,char[][] board,int[] leftrow,int[] lowerdia,int[] upperdia){
        if(col==n){
            count++;
            return;
        }
        for(int row=0;row<n;row++){
            if(leftrow[row]==0 && lowerdia[row+col]==0 && upperdia[n-1+col-row]==0){
                board[row][col]='Q';
                leftrow[row]=1;
                lowerdia[row+col]=1;
                upperdia[n-1+col-row]=1;
        solve(n,col+1,board,leftrow,lowerdia,upperdia);

                board[row][col]='.';
                leftrow[row]=0;
                lowerdia[row+col]=0;
                upperdia[n-1+col-row]=0;


            }
        }
    }
    public int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        int[] leftrow=new int[n];
        int[] lowerdia=new int[2*n-1];
        int[] upperdia=new int[2*n-1];
        solve(n,0,board,leftrow,lowerdia,upperdia);
        return count;

    }
}