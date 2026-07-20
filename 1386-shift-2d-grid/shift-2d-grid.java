class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows * cols;

        k = k % total;

        // Flatten the grid
        int[] arr = new int[total];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[index++] = grid[i][j];
            }
        }

        // Rotate the array
        ArrayList<Integer> al = new ArrayList<>();

        // Last k elements
        for (int i = total - k; i < total; i++) {
            al.add(arr[i]);
        }

        // Remaining elements
        for (int i = 0; i < total - k; i++) {
            al.add(arr[i]);
        }

        // Convert back to 2D List
        List<List<Integer>> ans = new ArrayList<>();

        index = 0;

        for (int i = 0; i < rows; i++) {
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                temp.add(al.get(index++));
            }

            ans.add(temp);
        }

        return ans;
    }
}