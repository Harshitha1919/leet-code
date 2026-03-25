class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        long gridSum = 0;   // FIX: long

        // total sum
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                gridSum += grid[i][j];
            }
        }

        long prefixSum = 0;  // FIX: long

        // horizontal cut
        for(int i = 0; i < m - 1; i++){
            long sum = 0;   // FIX: long
            for(int j = 0; j < n; j++){
                sum += grid[i][j];
            }

            prefixSum += sum;

            if(prefixSum == gridSum - prefixSum){
                return true;
            }
        }

        // reset
        prefixSum = 0;

        // vertical cut
        for(int j = 0; j < n - 1; j++){
            long sum = 0;   // FIX: long
            for(int i = 0; i < m; i++){
                sum += grid[i][j];
            }

            prefixSum += sum;

            if(prefixSum == gridSum - prefixSum){
                return true;
            }
        }

        return false;
    }
}