class Solution {
    public long minCost(String s, int[] cost) {
        HashMap<Character,Long> hs=new HashMap<>();
        long total=0;
        for(int i=0;i<s.length();i++){
            total+=cost[i];
            hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0L)+cost[i]);
        }
        long min1=Long.MAX_VALUE;
        long ans=0;
        for(char num:hs.keySet()){
             ans=total-hs.get(num);
            min1=Math.min(ans,min1);
        }
        return min1;
    }
}