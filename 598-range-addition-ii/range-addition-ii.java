class Solution {
    public int maxCount(int m, int n, int[][] ops) {
  if(ops.length==0){
    return n*m;
  }
        int min=Integer.MAX_VALUE;
         int min2=Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            min=Math.min(min,ops[i][0]);
            min2=Math.min(min2,ops[i][1]);
        }
        return min*min2;
    }
}