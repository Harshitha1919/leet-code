class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int index=0;
       int max1=0;
       for(int i=0;i<mat.length;i++){
            int count=0;
        for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1){
                count++;
            }
        }
        if(max1<count){
            max1=count;
            index=i;
        }
       }
       int arr[]=new int[2];
       arr[0]=index;
       arr[1]=max1;
       return arr;
    }
}