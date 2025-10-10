class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0;
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<banned.length;i++){
            hs.add(banned[i]);
        }
        for(int i=1;i<=n;i++){
           
             if(   (sum+i)<=maxSum && !hs.contains(i) ){
                 sum=sum+i;
                count++;
             }
        
        }
        return count;
    }
}