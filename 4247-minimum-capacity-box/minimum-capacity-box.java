class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
           int index=-1;
           int min1=Integer.MAX_VALUE;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                   if(min1>capacity[i]){
                   min1=capacity[i];
                   index=i;
                }
            }
        }
        return index;
        
    }
}