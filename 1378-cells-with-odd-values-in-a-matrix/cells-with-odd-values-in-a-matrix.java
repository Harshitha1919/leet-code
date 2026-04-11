class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        for(int i=0;i< indices.length;i++){
            int a=indices[i][0];
            int b=indices[i][1];
            for(int ik=0;ik<n;ik++){
                arr[a][ik]++;
            }
             for(int jk=0;jk<m;jk++){
                arr[jk][b]++;
            }
        }
        int count=0;
        for(int  i=0;i<arr.length;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}