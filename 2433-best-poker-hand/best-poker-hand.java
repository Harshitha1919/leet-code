class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int flag=0;
        for(int i=0;i<suits.length-1;i++){
            if(suits[i]!=suits[i+1]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return "Flush";
        }
        for(int i=0;i<ranks.length;i++){
            hs.put(ranks[i],hs.getOrDefault(ranks[i],0)+1);
        }
        for(int key:hs.keySet()){
            if(hs.get(key)>=3 ){
                return "Three of a Kind";
            }
            
        }
         for(int key:hs.keySet()){
            if(hs.get(key)==2 ){
                return "Pair";
            }
            
        }
        return "High Card";

    }
}