class Solution {
    public boolean ispresent(int [][] matrix,int index,int target){
         if (index < matrix.length) {
        int low = index;
        int high = matrix[0].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[index][mid] == target)
                return true;
            else if (matrix[index][mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
    }

    if (index < matrix[0].length) {
        int low = index;
        int high = matrix.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[mid][index] == target)
                return true;
            else if (matrix[mid][index] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
    }

    return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix[0].length;i++){
            if(ispresent(matrix,i,target)){
                   return true;
            }
           
        }
        return false;
    }
}