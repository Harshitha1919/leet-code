class Solution {
    public void solve(int n,int col,char[][] board,int[] leftrow,int[] lowerdia,int[] upperdia,List<List<String>> ls){
        if(col==n){
            List<String> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
               ans.add(new String(board[i]));
            }
            ls.add(ans);
            return;
        }

        for(int row=0;row<n;row++){
             if(leftrow[row]==0 && lowerdia[row+col]==0 && upperdia[n-1+col-row]==0){
                board[row][col]='Q';
                leftrow[row]=1;
                lowerdia[row+col]=1;
                upperdia[n-1+col-row]=1;

             
              solve(n,col+1,board,leftrow,lowerdia,upperdia,ls);
               board[row][col]='.';
                leftrow[row]=0;
                lowerdia[row+col]=0;
                upperdia[n-1+col-row]=0;
             }

            

        }

    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ls = new ArrayList<>();

         char[][]  board=new char[n][n];
        for(int i=0;i<n;i++){
        Arrays.fill(board[i],'.');
      }
      int leftrow[]=new int[n];
      int lowerdia[]=new int[2*n-1];
      int upperdia[]=new int[2*n-1];

     

      solve(n,0,board,leftrow,lowerdia,upperdia,ls);
      return ls;
    }
}