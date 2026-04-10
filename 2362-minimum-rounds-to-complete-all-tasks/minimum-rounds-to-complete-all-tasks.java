class Solution {
    public int minimumRounds(int[] tasks) {
        int ans=0;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int i=0;i<tasks.length;i++){
            hs.put(tasks[i],hs.getOrDefault(tasks[i],0)+1);
        }
        for(int v:hs.values()){
            if(v==1){
               return -1;
            }
            else if(v%3==0){
                ans=ans+(v/3);
            }
            else{
                ans=ans+(v/3)+1;
            }
        }
        return ans;
    }
}