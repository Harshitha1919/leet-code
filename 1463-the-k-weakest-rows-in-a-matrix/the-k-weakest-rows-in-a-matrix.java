class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==1){
                count++;
               }
            }
            hs.put(i,count);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->{
            if(!hs.get(a).equals(hs.get(b))){
                return hs.get(a) - hs.get(b);
            }
            return a-b;
        });
          for (int i = 0; i < mat.length; i++) {
            pq.add(i);
        }

        // Extract k weakest rows
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}