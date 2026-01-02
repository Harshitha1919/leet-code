class Solution {
    public int findChampion(int[][] grid) {
        int index=0;
        int max1=0;
        for(int i=0;i<grid.length;i++){
            int count=0;
            for(int j=0;j<grid[0].length;j++){
                if(i!=j && grid[i][j]==1){
                    
                    count++;
                } 
               
            }
            if(count>max1){
                max1=count;
                index=i;
            }
        }
        return index;
    }
}