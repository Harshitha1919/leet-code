class Solution {
    public boolean check(int i,int j,char [][] board,String word,int m,int n,int k){

         if(k==word.length()){
            return true;
        }
        if(i<0 || j<0 || i==m || j==n || board[i][j]!=word.charAt(k)){
            return false;
        }
       
        char character=board[i][j];
        board[i][j]='#';
        boolean op1=check( i+1,j,board,word,m,n,k+1);
        boolean op2=check(i,j-1,board,word,m,n,k+1);
        boolean op3=check(i,j+1,board,word,m,n,k+1);
        boolean op4=check(i-1,j,board,word,m,n,k+1);
        board[i][j]=character;
        return op1 || op2 || op3 || op4 ;

        
    }
    public boolean exist(char[][] board, String word) {
        int n=board[0].length;
        int m=board.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                 if(check( i,j,board,word,m,n,0)==true){
                    return true;
                 }
                }
            }
        }
        return false;
    }
}