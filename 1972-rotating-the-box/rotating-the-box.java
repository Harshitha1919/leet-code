class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
         char grid[][] = new char[boxGrid[0].length][boxGrid.length];

        // rotate clockwise
        for (int i = 0; i < boxGrid.length; i++) {
            for (int j = 0; j < boxGrid[0].length; j++) {

                grid[j][boxGrid.length - 1 - i] = boxGrid[i][j];
            }
        }

        int m = grid.length;
        int n = grid[0].length;

        // apply gravity
        for (int i = 0; i < n; i++) {

            for (int j = m - 2; j >= 0; j--) {

                int row = j;

                while (row + 1 < m &&
                       grid[row][i] == '#' &&
                       grid[row + 1][i] == '.') {

                    char temp = grid[row][i];
                    grid[row][i] = grid[row + 1][i];
                    grid[row + 1][i] = temp;

                    row++;
                }
            }
        }

        return grid;
    }
}