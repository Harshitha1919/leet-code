class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q=new LinkedList<>();
        
        for(int i=0;i<tickets.length;i++){
            q.add(new int[]{tickets[i],i});
        }
        int time=0;
        while(true){
          int[] h=q.poll();
            h[0]--;
           time++;
          if(h[0] == 0 && h[1] == k){
            return time;
        }

          if(h[0]>0){
          q.add(h);
          }

        }
     
        
            }
}