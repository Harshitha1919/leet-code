class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        TreeMap<Integer,Integer> hs=new TreeMap<>();
        for(int i=0;i<trips.length;i++){
            int passenger=trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];
           hs.put(from,hs.getOrDefault(from,0)+passenger);
           hs.put(to,hs.getOrDefault(to,0)-passenger);

        }
        int count=0;
        for(int change:hs.values()){
             count+=change;
             if(count>capacity){
                return false;
             }
        }
        return true;
    }
}