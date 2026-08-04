class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs=new HashSet<>();
        HashSet<Character> hs1=new HashSet<>();
           for(int i=0;i<9;i++){
            hs.clear();
            hs1.clear();
              for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                if(hs.contains(board[i][j]) ){
                    return false;
                }
                
                else{
                    hs.add(board[i][j]);
                }
                }

           if(board[j][i]!='.'){
                if(hs1.contains(board[j][i])){
                    return false;
                }
                
                else{
                    hs1.add(board[j][i]);
                }
           }
              }
           }

          for (int row = 0; row < 9; row += 3) {
    for (int col = 0; col < 9; col += 3) {

        hs.clear();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (board[row + i][col + j] != '.') {

                    if (hs.contains(board[row + i][col + j])) {
                        return false;
                    }

                    hs.add(board[row + i][col + j]);
                }
            }
        }
    }
}
           return true;
    }
}